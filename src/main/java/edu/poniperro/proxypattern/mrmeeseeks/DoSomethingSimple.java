package edu.poniperro.proxypattern.mrmeeseeks;

public interface DoSomethingSimple<T, R> {
        void doRequest(T type, R request);
}
