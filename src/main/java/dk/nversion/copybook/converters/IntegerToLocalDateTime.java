package dk.nversion.copybook.converters;

import dk.nversion.copybook.exceptions.TypeConverterException;

public class IntegerToLocalDateTime extends TypeConverterBase {

    @Override
    public void validate(Class type, int size, int decimals) throws TypeConverterException {

    }

    @Override
    public Object to(byte[] bytes, int offset, int length, boolean removePadding) throws TypeConverterException {
        return null;
    }

    @Override
    public byte[] from(Object value, int length, boolean addPadding) throws TypeConverterException {
        return new byte[0];
    }


}
