package br.com.mapreduce.leastsquare;

import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

class LeastSquareReducer extends Reducer {
    @Override
    protected void reduce(Object key, Iterable values, Context context) throws IOException, InterruptedException {
        super.reduce(key, values, context);
    }
}
