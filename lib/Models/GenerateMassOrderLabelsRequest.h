
/*
 * GenerateMassOrderLabelsRequest.h
 *
 * Данные, необходимые для генерации файла. 
 */

#ifndef TINY_CPP_CLIENT_GenerateMassOrderLabelsRequest_H_
#define TINY_CPP_CLIENT_GenerateMassOrderLabelsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации файла. 
 *
 *  \ingroup Models
 *
 */

class GenerateMassOrderLabelsRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateMassOrderLabelsRequest();
    GenerateMassOrderLabelsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateMassOrderLabelsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кабинета.
	 */
	long getBusinessId();

	/*! \brief Set Идентификатор кабинета.
	 */
	void setBusinessId(long  businessId);
	/*! \brief Get Список идентификаторов заказов.
	 */
	Set<long> getOrderIds();

	/*! \brief Set Список идентификаторов заказов.
	 */
	void setOrderIds(Set <long> orderIds);


    private:
    long businessId{};
    Set<long> orderIds;
};
}

#endif /* TINY_CPP_CLIENT_GenerateMassOrderLabelsRequest_H_ */
