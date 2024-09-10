package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ContentApiVerticle())
}

class ContentApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.ContentApiImpl").newInstance() as ContentApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ContentApi.address)
            .register(ContentApi::class.java,instance)
    }
}