package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OrderDeliveryApiVerticle())
}

class OrderDeliveryApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OrderDeliveryApiImpl").newInstance() as OrderDeliveryApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OrderDeliveryApi.address)
            .register(OrderDeliveryApi::class.java,instance)
    }
}