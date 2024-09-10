
/*
 * ReturnDecisionDTO.h
 *
 * Решения по возвратам.
 */

#ifndef TINY_CPP_CLIENT_ReturnDecisionDTO_H_
#define TINY_CPP_CLIENT_ReturnDecisionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ReturnDecisionReasonType.h"
#include "ReturnDecisionSubreasonType.h"
#include "ReturnDecisionType.h"
#include <list>

namespace Tiny {


/*! \brief Решения по возвратам.
 *
 *  \ingroup Models
 *
 */

class ReturnDecisionDTO{
public:

    /*! \brief Constructor.
	 */
    ReturnDecisionDTO();
    ReturnDecisionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnDecisionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор товара в возврате.
	 */
	long getReturnItemId();

	/*! \brief Set Идентификатор товара в возврате.
	 */
	void setReturnItemId(long  returnItemId);
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
	long getRefundAmount();

	/*! \brief Set Сумма возврата.
	 */
	void setRefundAmount(long  refundAmount);
	/*! \brief Get Компенсация за обратную доставку.
	 */
	long getPartnerCompensation();

	/*! \brief Set Компенсация за обратную доставку.
	 */
	void setPartnerCompensation(long  partnerCompensation);
	/*! \brief Get Список хеш-кодов фотографий товара от покупателя.
	 */
	std::list<std::string> getImages();

	/*! \brief Set Список хеш-кодов фотографий товара от покупателя.
	 */
	void setImages(std::list <std::string> images);


    private:
    long returnItemId{};
    int count{};
    std::string comment{};
    ReturnDecisionReasonType reasonType;
    ReturnDecisionSubreasonType subreasonType;
    ReturnDecisionType decisionType;
    long refundAmount{};
    long partnerCompensation{};
    std::list<std::string> images;
};
}

#endif /* TINY_CPP_CLIENT_ReturnDecisionDTO_H_ */
