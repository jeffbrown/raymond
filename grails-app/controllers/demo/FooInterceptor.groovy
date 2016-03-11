package demo


class FooInterceptor {

    public FooInterceptor() {
        matchAll()
    }

    boolean before() { true }

    boolean after() {
        println "Model: $model"
        true
    }

    void afterView() {
        // no-op
    }
}
