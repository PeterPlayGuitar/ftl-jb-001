package com.company.task025;

public class StringFilter implements Filter{
    @Override
    public boolean apply(Object o) {
        if (o instanceof String) {
            String s = (String)o;
            if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
                return true;
            else return false;
        }
        return false;
    }
}
