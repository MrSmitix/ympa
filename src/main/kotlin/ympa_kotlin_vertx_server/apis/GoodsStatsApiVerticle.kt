package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GoodsStatsApiVerticle())
}

class GoodsStatsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.GoodsStatsApiImpl").newInstance() as GoodsStatsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GoodsStatsApi.address)
            .register(GoodsStatsApi::class.java,instance)
    }
}