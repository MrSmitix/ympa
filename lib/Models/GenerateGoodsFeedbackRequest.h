
/*
 * GenerateGoodsFeedbackRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef TINY_CPP_CLIENT_GenerateGoodsFeedbackRequest_H_
#define TINY_CPP_CLIENT_GenerateGoodsFeedbackRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateGoodsFeedbackRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateGoodsFeedbackRequest();
    GenerateGoodsFeedbackRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateGoodsFeedbackRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор бизнеса.
	 */
	long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.
	 */
	void setBusinessId(long  businessId);


    private:
    long businessId{};
};
}

#endif /* TINY_CPP_CLIENT_GenerateGoodsFeedbackRequest_H_ */
