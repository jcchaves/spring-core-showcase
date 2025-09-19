package me.juliochaves.tutorials.showcases.spring.core.typeconversion.formatters;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.format.number.CurrencyStyleFormatter;
import org.springframework.format.number.NumberStyleFormatter;
import org.springframework.format.number.PercentStyleFormatter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import org.springframework.lang.NonNull;

public final class NumberFormatAnnotationFormatterFactory implements
        AnnotationFormatterFactory<NumberFormat> {

    @NonNull
    public Set<Class<?>> getFieldTypes() {
        return new HashSet<Class<?>>(asList(new Class<?>[] { Short.class,
                Integer.class, Long.class, Float.class, Double.class,
                BigDecimal.class, BigInteger.class }));
    }

    @NonNull
    public Printer<Number> getPrinter(@NonNull NumberFormat annotation,
            @NonNull Class<?> fieldType) {
        return configureFormatterFrom(annotation, fieldType);
    }

    @NonNull
    public Parser<Number> getParser(@NonNull NumberFormat annotation, @NonNull Class<?> fieldType) {
        return configureFormatterFrom(annotation, fieldType);
    }

    private Formatter<Number> configureFormatterFrom(NumberFormat annotation,
            Class<?> fieldType) {
        if (!annotation.pattern().isEmpty()) {
            return new NumberStyleFormatter(annotation.pattern());
        } else {
            Style style = annotation.style();
            if (style == Style.PERCENT) {
                return new PercentStyleFormatter();
            } else if (style == Style.CURRENCY) {
                return new CurrencyStyleFormatter();
            } else {
                return new NumberStyleFormatter();
            }
        }
    }
}