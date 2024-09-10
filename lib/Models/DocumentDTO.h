
/*
 * DocumentDTO.h
 *
 * Информация о документе.
 */

#ifndef TINY_CPP_CLIENT_DocumentDTO_H_
#define TINY_CPP_CLIENT_DocumentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "OrderDocumentStatusType.h"

namespace Tiny {


/*! \brief Информация о документе.
 *
 *  \ingroup Models
 *
 */

class DocumentDTO{
public:

    /*! \brief Constructor.
	 */
    DocumentDTO();
    DocumentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DocumentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderDocumentStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderDocumentStatusType  status);
	/*! \brief Get Номер документа.
	 */
	std::string getNumber();

	/*! \brief Set Номер документа.
	 */
	void setNumber(std::string  number);
	/*! \brief Get Дата создания документа.
	 */
	Date getDate();

	/*! \brief Set Дата создания документа.
	 */
	void setDate(Date  date);


    private:
    OrderDocumentStatusType status;
    std::string number{};
    Date date;
};
}

#endif /* TINY_CPP_CLIENT_DocumentDTO_H_ */
