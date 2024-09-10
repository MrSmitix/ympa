
/*
 * GenerateGoodsTurnoverRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef TINY_CPP_CLIENT_GenerateGoodsTurnoverRequest_H_
#define TINY_CPP_CLIENT_GenerateGoodsTurnoverRequest_H_


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

class GenerateGoodsTurnoverRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateGoodsTurnoverRequest();
    GenerateGoodsTurnoverRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateGoodsTurnoverRequest();


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
	/*! \brief Get Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
	 */
	Date getDate();

	/*! \brief Set Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
	 */
	void setDate(Date  date);


    private:
    long campaignId{};
    Date date;
};
}

#endif /* TINY_CPP_CLIENT_GenerateGoodsTurnoverRequest_H_ */
