/*
package com.company;

import org.supercsv.io.dozer.CsvDozerBeanReader;
import org.supercsv.io.dozer.ICsvDozerBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;

public class read {

    public void f(){
        ICsvDozerBeanReader beanReader = null;
        try {
            beanReader = new CsvDozerBeanReader(new FileReader(CSV_FILENAME),
                    CsvPreference.STANDARD_PREFERENCE);

            beanReader.getHeader(true); // ignore the header
            beanReader.configureBeanMapping(SurveyResponse.class, FIELD_MAPPING);

            SurveyResponse surveyResponse;
            while( (surveyResponse =
                    beanReader.read(SurveyResponse.class, processors)) != null ) {
                System.out.println(
                        String.format("lineNo=%s, rowNo=%s, surveyResponse=%s",
                                beanReader.getLineNumber(), beanReader.getRowNumber(),
                                surveyResponse));
            }

        } finally {
            if( beanReader != null ) {
                beanReader.close();
            }
        }
    }
}
*/
