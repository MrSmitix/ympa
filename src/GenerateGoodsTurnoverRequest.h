/*
 * GenerateGoodsTurnoverRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _GenerateGoodsTurnoverRequest_H_
#define _GenerateGoodsTurnoverRequest_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateGoodsTurnoverRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateGoodsTurnoverRequest();
	GenerateGoodsTurnoverRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateGoodsTurnoverRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кампании.
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
	 */
	Date getDate();

	/*! \brief Set Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
	 */
	void setDate(Date  date);

private:
	long long campaignId;
	Date date;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateGoodsTurnoverRequest_H_ */
