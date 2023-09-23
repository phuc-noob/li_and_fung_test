package com.liandfung.backend.utils;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CommonDataUtil {
    public static ModelMapper modelMapper;
    public static ModelMapper getModelMapper(){
        if (Objects.isNull(modelMapper)) {
            modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setSkipNullEnabled(true).setMatchingStrategy(MatchingStrategies.STRICT);
        }
        return modelMapper;
    }

    public static String convertDateToString(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date);
        return dateString;
    }
}
