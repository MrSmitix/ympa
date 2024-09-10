/*
 * ReturnDecisionDTO.h
 *
 * Решения по возвратам.
 */

#ifndef _ReturnDecisionDTO_H_
#define _ReturnDecisionDTO_H_


#include <string>
#include "ReturnDecisionReasonType.h"
#include "ReturnDecisionSubreasonType.h"
#include "ReturnDecisionType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Решения по возвратам.
 *
 *  \ingroup Models
 *
 */

class ReturnDecisionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ReturnDecisionDTO();
	ReturnDecisionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReturnDecisionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в возврате.
	 */
	long long getReturnItemId();

	/*! \brief Set Идентификатор товара в возврате.
	 */
	void setReturnItemId(long long  returnItemId);
	/*! \brief Get Количество единиц товара.
	 */
	int getCount();

	/*! \brief Set Количество единиц товара.
	 */
	void setCount(int  count);
	/*! \brief Get Комментарий.
	 */
	std::string getComment();

	/*! \brief Set Комментарий.
	 */
	void setComment(std::string  comment);
	/*! \brief Get 
	 */
	ReturnDecisionReasonType getReasonType();

	/*! \brief Set 
	 */
	void setReasonType(ReturnDecisionReasonType  reasonType);
	/*! \brief Get 
	 */
	ReturnDecisionSubreasonType getSubreasonType();

	/*! \brief Set 
	 */
	void setSubreasonType(ReturnDecisionSubreasonType  subreasonType);
	/*! \brief Get 
	 */
	ReturnDecisionType getDecisionType();

	/*! \brief Set 
	 */
	void setDecisionType(ReturnDecisionType  decisionType);
	/*! \brief Get Сумма возврата.
	 */
	long long getRefundAmount();

	/*! \brief Set Сумма возврата.
	 */
	void setRefundAmount(long long  refundAmount);
	/*! \brief Get Компенсация за обратную доставку.
	 */
	long long getPartnerCompensation();

	/*! \brief Set Компенсация за обратную доставку.
	 */
	void setPartnerCompensation(long long  partnerCompensation);
	/*! \brief Get Список хеш-кодов фотографий товара от покупателя.
	 */
	std::list<std::string> getImages();

	/*! \brief Set Список хеш-кодов фотографий товара от покупателя.
	 */
	void setImages(std::list <std::string> images);

private:
	long long returnItemId;
	int count;
	std::string comment;
	ReturnDecisionReasonType reasonType;
	ReturnDecisionSubreasonType subreasonType;
	ReturnDecisionType decisionType;
	long long refundAmount;
	long long partnerCompensation;
	std::list <std::string>images;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ReturnDecisionDTO_H_ */
