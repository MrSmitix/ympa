
/*
 * OrderBusinessDocumentsDTO.h
 *
 * Информация о документах. 
 */

#ifndef TINY_CPP_CLIENT_OrderBusinessDocumentsDTO_H_
#define TINY_CPP_CLIENT_OrderBusinessDocumentsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DocumentDTO.h"

namespace Tiny {


/*! \brief Информация о документах. 
 *
 *  \ingroup Models
 *
 */

class OrderBusinessDocumentsDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBusinessDocumentsDTO();
    OrderBusinessDocumentsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBusinessDocumentsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	DocumentDTO getUpd();

	/*! \brief Set 
	 */
	void setUpd(DocumentDTO  upd);
	/*! \brief Get 
	 */
	DocumentDTO getUkd();

	/*! \brief Set 
	 */
	void setUkd(DocumentDTO  ukd);
	/*! \brief Get 
	 */
	DocumentDTO getTorgTwelve();

	/*! \brief Set 
	 */
	void setTorgTwelve(DocumentDTO  torgTwelve);
	/*! \brief Get 
	 */
	DocumentDTO getSf();

	/*! \brief Set 
	 */
	void setSf(DocumentDTO  sf);
	/*! \brief Get 
	 */
	DocumentDTO getKsf();

	/*! \brief Set 
	 */
	void setKsf(DocumentDTO  ksf);


    private:
    DocumentDTO upd;
    DocumentDTO ukd;
    DocumentDTO torgTwelve;
    DocumentDTO sf;
    DocumentDTO ksf;
};
}

#endif /* TINY_CPP_CLIENT_OrderBusinessDocumentsDTO_H_ */
