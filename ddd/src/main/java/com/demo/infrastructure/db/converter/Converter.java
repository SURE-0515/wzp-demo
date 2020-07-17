package com.demo.infrastructure.db.converter;

public interface Converter<T, R> {

    R serialize(T t);

    T deserialize(R r);

}
