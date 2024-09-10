package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OrdersApiVerticle())
}

class OrdersApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OrdersApiImpl").newInstance() as OrdersApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OrdersApi.address)
            .register(OrdersApi::class.java,instance)
    }
}