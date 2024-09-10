package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(DbsApiVerticle())
}

class DbsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.DbsApiImpl").newInstance() as DbsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(DbsApi.address)
            .register(DbsApi::class.java,instance)
    }
}