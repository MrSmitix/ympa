package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(RatingsApiVerticle())
}

class RatingsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.RatingsApiImpl").newInstance() as RatingsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(RatingsApi.address)
            .register(RatingsApi::class.java,instance)
    }
}