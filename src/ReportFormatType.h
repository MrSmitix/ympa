/*
 * ReportFormatType.h
 *
 * Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */

#ifndef _ReportFormatType_H_
#define _ReportFormatType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
 *
 *  \ingroup Models
 *
 */

class ReportFormatType : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportFormatType();
	ReportFormatType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportFormatType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ReportFormatType_H_ */
