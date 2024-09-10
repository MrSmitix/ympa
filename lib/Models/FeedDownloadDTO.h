
/*
 * FeedDownloadDTO.h
 *
 * Информация о последней загрузке прайс-листа.
 */

#ifndef TINY_CPP_CLIENT_FeedDownloadDTO_H_
#define TINY_CPP_CLIENT_FeedDownloadDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedDownloadErrorDTO.h"
#include "FeedStatusType.h"

namespace Tiny {


/*! \brief Информация о последней загрузке прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedDownloadDTO{
public:

    /*! \brief Constructor.
	 */
    FeedDownloadDTO();
    FeedDownloadDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedDownloadDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FeedStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedStatusType  status);
	/*! \brief Get 
	 */
	FeedDownloadErrorDTO getError();

	/*! \brief Set 
	 */
	void setError(FeedDownloadErrorDTO  error);


    private:
    FeedStatusType status;
    FeedDownloadErrorDTO error;
};
}

#endif /* TINY_CPP_CLIENT_FeedDownloadDTO_H_ */
