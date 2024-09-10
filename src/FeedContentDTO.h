/*
 * FeedContentDTO.h
 *
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */

#ifndef _FeedContentDTO_H_
#define _FeedContentDTO_H_


#include <string>
#include "FeedContentErrorDTO.h"
#include "FeedStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 *
 *  \ingroup Models
 *
 */

class FeedContentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedContentDTO();
	FeedContentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedContentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
	 */
	long long getRejectedOffersCount();

	/*! \brief Set Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
	 */
	void setRejectedOffersCount(long long  rejectedOffersCount);
	/*! \brief Get 
	 */
	FeedStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedStatusType  status);
	/*! \brief Get Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
	 */
	long long getTotalOffersCount();

	/*! \brief Set Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
	 */
	void setTotalOffersCount(long long  totalOffersCount);
	/*! \brief Get 
	 */
	FeedContentErrorDTO getError();

	/*! \brief Set 
	 */
	void setError(FeedContentErrorDTO  error);

private:
	long long rejectedOffersCount;
	FeedStatusType status;
	long long totalOffersCount;
	FeedContentErrorDTO error;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedContentDTO_H_ */
