package demo


class DemoInterceptor {

    public DemoInterceptor() {
        matchAll()
    }
    boolean before() {
        log.info "Controller: ${controllerName}, Action: ${actionName}"
        true
    }
}
