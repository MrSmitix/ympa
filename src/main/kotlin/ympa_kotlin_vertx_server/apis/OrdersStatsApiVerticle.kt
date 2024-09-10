package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OrdersStatsApiVerticle())
}

class OrdersStatsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OrdersStatsApiImpl").newInstance() as OrdersStatsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OrdersStatsApi.address)
            .register(OrdersStatsApi::class.java,instance)
    }
}