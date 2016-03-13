package demo

class DemoController {

    def index() {
        render view: 'index'
    }

    def report() {
        [name: 'Raymond']
    }
}
