package com.sithu.movierecommendersysspring.lesson;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class CollaborativeFilter implements Filter {

    //@Primary
    //Dynamic bean selection => this will create CollaborativeFilter as dependency while building RecommenderImplementation
    @Override
    public String[] recommendMovies() {
        return new String[]{"collaborativeFilter1","collaborativeFilter2"};
    }
}
