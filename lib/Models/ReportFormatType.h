
/*
 * ReportFormatType.h
 *
 * Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */

#ifndef TINY_CPP_CLIENT_ReportFormatType_H_
#define TINY_CPP_CLIENT_ReportFormatType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
 *
 *  \ingroup Models
 *
 */

class ReportFormatType{
public:

    /*! \brief Constructor.
	 */
    ReportFormatType();
    ReportFormatType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportFormatType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportFormatType_H_ */
