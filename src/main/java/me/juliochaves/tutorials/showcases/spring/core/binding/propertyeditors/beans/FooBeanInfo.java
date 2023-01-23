package me.juliochaves.tutorials.showcases.spring.core.binding.propertyeditors.beans;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.SimpleBeanInfo;

import org.springframework.beans.propertyeditors.CustomNumberEditor;

public class FooBeanInfo extends SimpleBeanInfo {
//	@Override
//	public PropertyDescriptor[] getPropertyDescriptors() {
//		try {
////			final PropertyEditor datePE = new CustomDateEditor(
////					new SimpleDateFormat("yyyy-MM-dd"), true);
////			PropertyDescriptor dateDescriptor = new PropertyDescriptor("date",
////					Foo.class) {
////				@Override
////				public PropertyEditor createPropertyEditor(Object bean) {
////					return datePE;
////				};
////			};
//			final PropertyEditor idPE = new CustomNumberEditor(Integer.class,
//					true);
//			PropertyDescriptor idDescriptor = new PropertyDescriptor("id",
//					Foo.class) {
//				@Override
//				public PropertyEditor createPropertyEditor(Object bean) {
//					return idPE;
//				}
//			};
//			return new PropertyDescriptor[] { /*dateDescriptor, */ idDescriptor };
//		} catch (IntrospectionException ex) {
//			throw new Error(ex.toString());
//		}
//	}
}
