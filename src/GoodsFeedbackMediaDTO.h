/*
 * GoodsFeedbackMediaDTO.h
 *
 * Фото и видео.
 */

#ifndef _GoodsFeedbackMediaDTO_H_
#define _GoodsFeedbackMediaDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фото и видео.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackMediaDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackMediaDTO();
	GoodsFeedbackMediaDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackMediaDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ссылки на фото.
	 */
	std::list<std::string> getPhotos();

	/*! \brief Set Ссылки на фото.
	 */
	void setPhotos(std::list <std::string> photos);
	/*! \brief Get Ссылки на видео.
	 */
	std::list<std::string> getVideos();

	/*! \brief Set Ссылки на видео.
	 */
	void setVideos(std::list <std::string> videos);

private:
	std::list <std::string>photos;
	std::list <std::string>videos;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackMediaDTO_H_ */
