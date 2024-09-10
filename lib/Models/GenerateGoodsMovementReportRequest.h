
/*
 * GenerateGoodsMovementReportRequest.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef TINY_CPP_CLIENT_GenerateGoodsMovementReportRequest_H_
#define TINY_CPP_CLIENT_GenerateGoodsMovementReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateGoodsMovementReportRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateGoodsMovementReportRequest();
    GenerateGoodsMovementReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateGoodsMovementReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кампании.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Начало периода, включительно.
	 */
	Date getDateFrom();

	/*! \brief Set Начало периода, включительно.
	 */
	void setDateFrom(Date  dateFrom);
	/*! \brief Get Конец периода, включительно.
	 */
	Date getDateTo();

	/*! \brief Set Конец периода, включительно.
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);


    private:
    long campaignId{};
    Date dateFrom;
    Date dateTo;
    std::string shopSku{};
};
}

#endif /* TINY_CPP_CLIENT_GenerateGoodsMovementReportRequest_H_ */
