package day12.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // x 를 주면 y 를 추출해줄게
    Y apply(X x);
}
