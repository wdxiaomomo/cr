package com.halu.qq.cr.persistence.entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		String simpleName = this.getClass().getSimpleName();
		Field[] fs = this.getClass().getDeclaredFields();
		StringBuilder stringBuilder = new StringBuilder("");
		stringBuilder.append(simpleName + " ");
		for (Field f : fs) {
			try {
				Object val = BeanUtils.getProperty(this, f.getName());
				stringBuilder.append("[" + f.getName() + "=");
				stringBuilder.append((val == null ? "" : val.toString()) + "], ");
			} catch (NoSuchMethodException e) {
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}catch(NullPointerException e){
				stringBuilder.append("[" + f.getName() + "=(null)");
			}
		}
		return stringBuilder.toString();
	}
}
