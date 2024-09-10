/*
 * OrderBusinessDocumentsDTO.h
 *
 * Информация о документах. 
 */

#ifndef _OrderBusinessDocumentsDTO_H_
#define _OrderBusinessDocumentsDTO_H_


#include <string>
#include "DocumentDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о документах. 
 *
 *  \ingroup Models
 *
 */

class OrderBusinessDocumentsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBusinessDocumentsDTO();
	OrderBusinessDocumentsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBusinessDocumentsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBusinessDocumentsDTO_H_ */
