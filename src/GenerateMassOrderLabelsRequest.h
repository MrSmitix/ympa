/*
 * GenerateMassOrderLabelsRequest.h
 *
 * Данные, необходимые для генерации файла. 
 */

#ifndef _GenerateMassOrderLabelsRequest_H_
#define _GenerateMassOrderLabelsRequest_H_


#include <string>
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации файла. 
 *
 *  \ingroup Models
 *
 */

class GenerateMassOrderLabelsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateMassOrderLabelsRequest();
	GenerateMassOrderLabelsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateMassOrderLabelsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кабинета.
	 */
	long long getBusinessId();

	/*! \brief Set Идентификатор кабинета.
	 */
	void setBusinessId(long long  businessId);
	/*! \brief Get Список идентификаторов заказов.
	 */
	Set<long long> getOrderIds();

	/*! \brief Set Список идентификаторов заказов.
	 */
	void setOrderIds(Set <long long> orderIds);

private:
	long long businessId;
	Set <long long>orderIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateMassOrderLabelsRequest_H_ */
