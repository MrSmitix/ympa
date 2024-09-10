
/*
 * FeedContentDTO.h
 *
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */

#ifndef TINY_CPP_CLIENT_FeedContentDTO_H_
#define TINY_CPP_CLIENT_FeedContentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedContentErrorDTO.h"
#include "FeedStatusType.h"

namespace Tiny {


/*! \brief Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 *
 *  \ingroup Models
 *
 */

class FeedContentDTO{
public:

    /*! \brief Constructor.
	 */
    FeedContentDTO();
    FeedContentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedContentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
	 */
	long getRejectedOffersCount();

	/*! \brief Set Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
	 */
	void setRejectedOffersCount(long  rejectedOffersCount);
	/*! \brief Get 
	 */
	FeedStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedStatusType  status);
	/*! \brief Get Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
	 */
	long getTotalOffersCount();

	/*! \brief Set Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
	 */
	void setTotalOffersCount(long  totalOffersCount);
	/*! \brief Get 
	 */
	FeedContentErrorDTO getError();

	/*! \brief Set 
	 */
	void setError(FeedContentErrorDTO  error);


    private:
    long rejectedOffersCount{};
    FeedStatusType status;
    long totalOffersCount{};
    FeedContentErrorDTO error;
};
}

#endif /* TINY_CPP_CLIENT_FeedContentDTO_H_ */
