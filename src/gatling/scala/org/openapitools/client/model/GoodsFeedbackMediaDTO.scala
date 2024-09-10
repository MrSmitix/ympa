
package org.openapitools.client.model


case class GoodsFeedbackMediaDTO (
    /* Ссылки на фото. */
    _photos: Option[List[String]],
    /* Ссылки на видео. */
    _videos: Option[List[String]]
)
object GoodsFeedbackMediaDTO {
    def toStringBody(var_photos: Object, var_videos: Object) =
        s"""
        | {
        | "photos":$var_photos,"videos":$var_videos
        | }
        """.stripMargin
}
