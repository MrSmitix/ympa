package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BusinessesApiVerticle())
}

class BusinessesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.BusinessesApiImpl").newInstance() as BusinessesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BusinessesApi.address)
            .register(BusinessesApi::class.java,instance)
    }
}