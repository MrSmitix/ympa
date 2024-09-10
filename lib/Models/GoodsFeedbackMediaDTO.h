
/*
 * GoodsFeedbackMediaDTO.h
 *
 * Фото и видео.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackMediaDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackMediaDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Фото и видео.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackMediaDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackMediaDTO();
    GoodsFeedbackMediaDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackMediaDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<std::string> photos;
    std::list<std::string> videos;
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackMediaDTO_H_ */
