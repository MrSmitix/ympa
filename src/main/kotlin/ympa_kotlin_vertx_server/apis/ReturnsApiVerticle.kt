package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ReturnsApiVerticle())
}

class ReturnsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.ReturnsApiImpl").newInstance() as ReturnsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ReturnsApi.address)
            .register(ReturnsApi::class.java,instance)
    }
}