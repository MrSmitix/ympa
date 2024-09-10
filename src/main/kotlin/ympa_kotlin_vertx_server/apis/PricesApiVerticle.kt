package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PricesApiVerticle())
}

class PricesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.PricesApiImpl").newInstance() as PricesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PricesApi.address)
            .register(PricesApi::class.java,instance)
    }
}