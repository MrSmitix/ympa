package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(StocksApiVerticle())
}

class StocksApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.StocksApiImpl").newInstance() as StocksApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(StocksApi.address)
            .register(StocksApi::class.java,instance)
    }
}