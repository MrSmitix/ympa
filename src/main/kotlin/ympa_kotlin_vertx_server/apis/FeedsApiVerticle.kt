package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(FeedsApiVerticle())
}

class FeedsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.FeedsApiImpl").newInstance() as FeedsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(FeedsApi.address)
            .register(FeedsApi::class.java,instance)
    }
}