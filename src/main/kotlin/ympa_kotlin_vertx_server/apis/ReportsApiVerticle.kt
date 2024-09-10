package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ReportsApiVerticle())
}

class ReportsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.ReportsApiImpl").newInstance() as ReportsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ReportsApi.address)
            .register(ReportsApi::class.java,instance)
    }
}