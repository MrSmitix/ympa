package org.openapitools.server.model


/**
 * Фото и видео.
 *
 * @param photos Ссылки на фото. for example: ''null''
 * @param videos Ссылки на видео. for example: ''null''
*/
final case class GoodsFeedbackMediaDTO (
  photos: Option[Seq[String]] = None,
  videos: Option[Seq[String]] = None
)

