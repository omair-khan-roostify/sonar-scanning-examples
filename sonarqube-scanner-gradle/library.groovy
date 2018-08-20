@Library('somelib')
import http://localhost:8080/job/my-test/job/master/

int useSomeLib(Helper helper) {
    helper.prepare()
    return helper.count()
}

echo useSomeLib(new Helper('some text'))
