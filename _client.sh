#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# ! Generator version: 7.8.0
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "getBidsInfoForBusiness[Информация об установленных ставках]" \
            "getBidsRecommendations[Рекомендованные ставки для заданных товаров]" \
            "putBidsForBusiness[Включение буста продаж и установка ставок]" \
            "putBidsForCampaign[Включение буста продаж и установка ставок для магазина]"             "addOffersToArchive[Добавление товаров в архив]" \
            "deleteOffers[Удаление товаров из каталога]" \
            "deleteOffersFromArchive[Удаление товаров из архива]" \
            "getOfferMappings[Информация о товарах в каталоге]" \
            "getSuggestedOfferMappings[Просмотр карточек на Маркете, которые подходят вашим товарам]" \
            "updateOfferMappings[Добавление товаров в каталог и изменение информации о них]"             "getBusinessSettings[Настройки кабинета]"             "getCampaign[Информация о магазине]" \
            "getCampaignLogins[Логины, связанные с магазином]" \
            "getCampaignRegion[Регион магазина]" \
            "getCampaignSettings[Настройки магазина]" \
            "getCampaigns[Список магазинов пользователя]" \
            "getCampaignsByLogin[Магазины, доступные логину]"             "getCategoriesMaxSaleQuantum[Лимит на установку кванта продажи и минимального количества товаров в заказе]" \
            "getCategoriesTree[Дерево категорий]"             "createChat[Создание нового чата с покупателем]" \
            "getChatHistory[Получение истории сообщений в чате]" \
            "getChats[Получение доступных чатов]" \
            "sendFileToChat[Отправка файла в чат]" \
            "sendMessageToChat[Отправка сообщения в чат]"             "getCategoryContentParameters[Списки характеристик товаров по категориям]" \
            "getOfferCardsContentStatus[Получение информации о заполненности карточек магазина]" \
            "updateOfferContent[Редактирование категорийных характеристик товара]"             "acceptOrderCancellation[Отмена заказа покупателем]" \
            "addHiddenOffers[Скрытие товаров и настройки скрытия]" \
            "addOffersToArchive[Добавление товаров в архив]" \
            "calculateTariffs[Калькулятор стоимости услуг]" \
            "confirmBusinessPrices[Удаление товара из карантина по цене в кабинете]" \
            "confirmCampaignPrices[Удаление товара из карантина по цене в магазине]" \
            "createChat[Создание нового чата с покупателем]" \
            "createOutlet[Создание точки продаж]" \
            "deleteCampaignOffers[Удаление товаров из ассортимента магазина]" \
            "deleteGoodsFeedbackComment[Удаление комментария к отзыву]" \
            "deleteHiddenOffers[Возобновление показа товаров]" \
            "deleteOffers[Удаление товаров из каталога]" \
            "deleteOffersFromArchive[Удаление товаров из архива]" \
            "deleteOutlet[Удаление точки продаж]" \
            "deleteOutletLicenses[Удаление лицензий для точек продаж]" \
            "deletePromoOffers[Удаление товаров из акции]" \
            "generateBoostConsolidatedReport[Отчет по бусту продаж]" \
            "generateCompetitorsPositionReport[Отчет «Конкурентная позиция»]" \
            "generateGoodsFeedbackReport[Отчет по отзывам о товарах]" \
            "generateMassOrderLabelsReport[Готовые ярлыки‑наклейки на все коробки в нескольких заказах]" \
            "generateOrderLabel[Готовый ярлык‑наклейка для коробки в заказе]" \
            "generateOrderLabels[Готовые ярлыки‑наклейки на все коробки в одном заказе]" \
            "generatePricesReport[Отчет «Цены на рынке»]" \
            "generateShelfsStatisticsReport[Отчет по полкам]" \
            "generateShowsSalesReport[Отчет «Аналитика продаж»]" \
            "generateStocksOnWarehousesReport[Отчет по остаткам на складах]" \
            "generateUnitedMarketplaceServicesReport[Отчет по стоимости услуг]" \
            "generateUnitedNettingReport[Отчет по платежам]" \
            "generateUnitedOrdersReport[Отчет по заказам]" \
            "getAllOffers[Все предложения магазина]" \
            "getBidsInfoForBusiness[Информация об установленных ставках]" \
            "getBidsRecommendations[Рекомендованные ставки для заданных товаров]" \
            "getBusinessQuarantineOffers[Список товаров, находящихся в карантине по цене в кабинете]" \
            "getBusinessSettings[Настройки кабинета]" \
            "getCampaign[Информация о магазине]" \
            "getCampaignLogins[Логины, связанные с магазином]" \
            "getCampaignOffers[Информация о товарах, которые размещены в заданном магазине]" \
            "getCampaignQuarantineOffers[Список товаров, находящихся в карантине по цене в магазине]" \
            "getCampaignRegion[Регион магазина]" \
            "getCampaignSettings[Настройки магазина]" \
            "getCampaigns[Список магазинов пользователя]" \
            "getCampaignsByLogin[Магазины, доступные логину]" \
            "getCategoriesMaxSaleQuantum[Лимит на установку кванта продажи и минимального количества товаров в заказе]" \
            "getCategoriesTree[Дерево категорий]" \
            "getCategoryContentParameters[Списки характеристик товаров по категориям]" \
            "getChatHistory[Получение истории сообщений в чате]" \
            "getChats[Получение доступных чатов]" \
            "getDeliveryServices[Справочник служб доставки]" \
            "getFeed[Информация о прайс-листе]" \
            "getFeedIndexLogs[Отчет по индексации прайс-листа]" \
            "getFeedbackAndCommentUpdates[Новые и обновленные отзывы о магазине]" \
            "getFeeds[Список прайс-листов магазина]" \
            "getGoodsFeedbackComments[Получение комментариев к отзыву]" \
            "getGoodsFeedbacks[Получение отзывов о товарах продавца]" \
            "getGoodsStats[Отчет по товарам]" \
            "getHiddenOffers[Информация о скрытых вами товарах]" \
            "getModel[Информация об одной модели]" \
            "getModelOffers[Список предложений для одной модели]" \
            "getModels[Информация о нескольких моделях]" \
            "getModelsOffers[Список предложений для нескольких моделей]" \
            "getOfferCardsContentStatus[Получение информации о заполненности карточек магазина]" \
            "getOfferMappingEntries[Список товаров в каталоге]" \
            "getOfferMappings[Информация о товарах в каталоге]" \
            "getOfferRecommendations[Рекомендации Маркета, касающиеся цен]" \
            "getOffers[Предложения магазина]" \
            "getOrder[Информация об одном заказе]" \
            "getOrderBusinessBuyerInfo[Информация о покупателе — юридическом лице]" \
            "getOrderBusinessDocumentsInfo[Информация о документах]" \
            "getOrderBuyerInfo[Информация о покупателе — физическом лице]" \
            "getOrderLabelsData[Данные для самостоятельного изготовления ярлыков]" \
            "getOrders[Информация о нескольких заказах]" \
            "getOrdersStats[Детальная информация по заказам]" \
            "getOutlet[Информация об одной точке продаж]" \
            "getOutletLicenses[Информация о лицензиях для точек продаж]" \
            "getOutlets[Информация о нескольких точках продаж]" \
            "getPrices[Список цен]" \
            "getPricesByOfferIds[Просмотр цен на указанные товары в магазине]" \
            "getPromoOffers[Получение списка товаров, которые участвуют или могут участвовать в акции]" \
            "getPromos[Получение списка акций]" \
            "getQualityRatingDetails[Заказы, которые повлияли на индекс качества]" \
            "getQualityRatings[Индекс качества магазинов]" \
            "getReportInfo[Получение заданного отчета]" \
            "getReturn[Информация о невыкупе или возврате]" \
            "getReturnApplication[Получение заявления на возврат]" \
            "getReturnPhoto[Получение фотографии возврата]" \
            "getReturns[Список невыкупов и возвратов]" \
            "getStocks[Информация об остатках и оборачиваемости]" \
            "getSuggestedOfferMappingEntries[Рекомендованные карточки для товаров]" \
            "getSuggestedOfferMappings[Просмотр карточек на Маркете, которые подходят вашим товарам]" \
            "getSuggestedPrices[Цены для продвижения товаров]" \
            "getWarehouses[Список складов и групп складов]" \
            "provideOrderDigitalCodes[Передача ключей цифровых товаров]" \
            "provideOrderItemIdentifiers[Передача кодов маркировки единиц товара]" \
            "putBidsForBusiness[Включение буста продаж и установка ставок]" \
            "putBidsForCampaign[Включение буста продаж и установка ставок для магазина]" \
            "refreshFeed[Сообщить, что прайс-лист обновился]" \
            "searchModels[Поиск модели товара]" \
            "searchRegionChildren[Информация о дочерних регионах]" \
            "searchRegionsById[Информация о регионе]" \
            "searchRegionsByName[Поиск регионов по их имени]" \
            "sendFileToChat[Отправка файла в чат]" \
            "sendMessageToChat[Отправка сообщения в чат]" \
            "setFeedParams[Изменение параметров прайс-листа]" \
            "setOrderBoxLayout[Подготовка заказа]" \
            "setOrderDeliveryDate[Изменение даты доставки заказа]" \
            "setOrderDeliveryTrackCode[Передача трек‑номера посылки]" \
            "setOrderShipmentBoxes[Передача количества грузовых мест в заказе]" \
            "setReturnDecision[Принятие или изменение решения по возврату]" \
            "skipGoodsFeedbacksReaction[Отказ от ответа на отзывы]" \
            "submitReturnDecision[Подтверждение решения по возврату]" \
            "updateBusinessPrices[Установка цен на товары во всех магазинах]" \
            "updateCampaignOffers[Изменение условий продажи товаров в магазине]" \
            "updateGoodsFeedbackComment[Добавление нового или изменение созданного комментария]" \
            "updateOfferContent[Редактирование категорийных характеристик товара]" \
            "updateOfferMappingEntries[Добавление и редактирование товаров в каталоге]" \
            "updateOfferMappings[Добавление товаров в каталог и изменение информации о них]" \
            "updateOrderItems[Удаление товара из заказа или уменьшение числа единиц]" \
            "updateOrderStatus[Изменение статуса одного заказа]" \
            "updateOrderStatuses[Изменение статусов нескольких заказов]" \
            "updateOrderStorageLimit[Продление срока хранения заказа]" \
            "updateOutlet[Изменение информации о точке продаж]" \
            "updateOutletLicenses[Создание и изменение лицензий для точек продаж]" \
            "updatePrices[Установка цен на товары в конкретном магазине]" \
            "updatePromoOffers[Добавление товаров в акцию или изменение их цен]" \
            "updateStocks[Передача информации об остатках]"             "getDeliveryServices[Справочник служб доставки]"             "addHiddenOffers[Скрытие товаров и настройки скрытия]" \
            "addOffersToArchive[Добавление товаров в архив]" \
            "calculateTariffs[Калькулятор стоимости услуг]" \
            "confirmBusinessPrices[Удаление товара из карантина по цене в кабинете]" \
            "confirmCampaignPrices[Удаление товара из карантина по цене в магазине]" \
            "createChat[Создание нового чата с покупателем]" \
            "deleteCampaignOffers[Удаление товаров из ассортимента магазина]" \
            "deleteGoodsFeedbackComment[Удаление комментария к отзыву]" \
            "deleteHiddenOffers[Возобновление показа товаров]" \
            "deleteOffers[Удаление товаров из каталога]" \
            "deleteOffersFromArchive[Удаление товаров из архива]" \
            "deletePromoOffers[Удаление товаров из акции]" \
            "generateBoostConsolidatedReport[Отчет по бусту продаж]" \
            "generateCompetitorsPositionReport[Отчет «Конкурентная позиция»]" \
            "generateGoodsFeedbackReport[Отчет по отзывам о товарах]" \
            "generateGoodsRealizationReport[Отчет по реализации]" \
            "generateMassOrderLabelsReport[Готовые ярлыки‑наклейки на все коробки в нескольких заказах]" \
            "generateOrderLabel[Готовый ярлык‑наклейка для коробки в заказе]" \
            "generateOrderLabels[Готовые ярлыки‑наклейки на все коробки в одном заказе]" \
            "generatePricesReport[Отчет «Цены на рынке»]" \
            "generateShelfsStatisticsReport[Отчет по полкам]" \
            "generateShowsSalesReport[Отчет «Аналитика продаж»]" \
            "generateStocksOnWarehousesReport[Отчет по остаткам на складах]" \
            "generateUnitedMarketplaceServicesReport[Отчет по стоимости услуг]" \
            "generateUnitedNettingReport[Отчет по платежам]" \
            "generateUnitedOrdersReport[Отчет по заказам]" \
            "getAllOffers[Все предложения магазина]" \
            "getBidsInfoForBusiness[Информация об установленных ставках]" \
            "getBidsRecommendations[Рекомендованные ставки для заданных товаров]" \
            "getBusinessQuarantineOffers[Список товаров, находящихся в карантине по цене в кабинете]" \
            "getBusinessSettings[Настройки кабинета]" \
            "getCampaign[Информация о магазине]" \
            "getCampaignLogins[Логины, связанные с магазином]" \
            "getCampaignOffers[Информация о товарах, которые размещены в заданном магазине]" \
            "getCampaignQuarantineOffers[Список товаров, находящихся в карантине по цене в магазине]" \
            "getCampaignRegion[Регион магазина]" \
            "getCampaignSettings[Настройки магазина]" \
            "getCampaigns[Список магазинов пользователя]" \
            "getCampaignsByLogin[Магазины, доступные логину]" \
            "getCategoriesMaxSaleQuantum[Лимит на установку кванта продажи и минимального количества товаров в заказе]" \
            "getCategoriesTree[Дерево категорий]" \
            "getCategoryContentParameters[Списки характеристик товаров по категориям]" \
            "getChatHistory[Получение истории сообщений в чате]" \
            "getChats[Получение доступных чатов]" \
            "getDeliveryServices[Справочник служб доставки]" \
            "getFeed[Информация о прайс-листе]" \
            "getFeedIndexLogs[Отчет по индексации прайс-листа]" \
            "getFeedbackAndCommentUpdates[Новые и обновленные отзывы о магазине]" \
            "getFeeds[Список прайс-листов магазина]" \
            "getGoodsFeedbackComments[Получение комментариев к отзыву]" \
            "getGoodsFeedbacks[Получение отзывов о товарах продавца]" \
            "getGoodsStats[Отчет по товарам]" \
            "getHiddenOffers[Информация о скрытых вами товарах]" \
            "getOfferCardsContentStatus[Получение информации о заполненности карточек магазина]" \
            "getOfferMappingEntries[Список товаров в каталоге]" \
            "getOfferMappings[Информация о товарах в каталоге]" \
            "getOfferRecommendations[Рекомендации Маркета, касающиеся цен]" \
            "getOffers[Предложения магазина]" \
            "getOrder[Информация об одном заказе]" \
            "getOrderBusinessBuyerInfo[Информация о покупателе — юридическом лице]" \
            "getOrderBusinessDocumentsInfo[Информация о документах]" \
            "getOrderLabelsData[Данные для самостоятельного изготовления ярлыков]" \
            "getOrders[Информация о нескольких заказах]" \
            "getOrdersStats[Детальная информация по заказам]" \
            "getPrices[Список цен]" \
            "getPricesByOfferIds[Просмотр цен на указанные товары в магазине]" \
            "getPromoOffers[Получение списка товаров, которые участвуют или могут участвовать в акции]" \
            "getPromos[Получение списка акций]" \
            "getQualityRatingDetails[Заказы, которые повлияли на индекс качества]" \
            "getQualityRatings[Индекс качества магазинов]" \
            "getReportInfo[Получение заданного отчета]" \
            "getReturn[Информация о невыкупе или возврате]" \
            "getReturnApplication[Получение заявления на возврат]" \
            "getReturnPhoto[Получение фотографии возврата]" \
            "getReturns[Список невыкупов и возвратов]" \
            "getStocks[Информация об остатках и оборачиваемости]" \
            "getSuggestedOfferMappingEntries[Рекомендованные карточки для товаров]" \
            "getSuggestedOfferMappings[Просмотр карточек на Маркете, которые подходят вашим товарам]" \
            "getSuggestedPrices[Цены для продвижения товаров]" \
            "getWarehouses[Список складов и групп складов]" \
            "provideOrderItemIdentifiers[Передача кодов маркировки единиц товара]" \
            "putBidsForBusiness[Включение буста продаж и установка ставок]" \
            "putBidsForCampaign[Включение буста продаж и установка ставок для магазина]" \
            "refreshFeed[Сообщить, что прайс-лист обновился]" \
            "searchRegionChildren[Информация о дочерних регионах]" \
            "searchRegionsById[Информация о регионе]" \
            "searchRegionsByName[Поиск регионов по их имени]" \
            "sendFileToChat[Отправка файла в чат]" \
            "sendMessageToChat[Отправка сообщения в чат]" \
            "setFeedParams[Изменение параметров прайс-листа]" \
            "setOrderBoxLayout[Подготовка заказа]" \
            "setOrderShipmentBoxes[Передача количества грузовых мест в заказе]" \
            "skipGoodsFeedbacksReaction[Отказ от ответа на отзывы]" \
            "updateBusinessPrices[Установка цен на товары во всех магазинах]" \
            "updateCampaignOffers[Изменение условий продажи товаров в магазине]" \
            "updateGoodsFeedbackComment[Добавление нового или изменение созданного комментария]" \
            "updateOfferContent[Редактирование категорийных характеристик товара]" \
            "updateOfferMappingEntries[Добавление и редактирование товаров в каталоге]" \
            "updateOfferMappings[Добавление товаров в каталог и изменение информации о них]" \
            "updateOrderItems[Удаление товара из заказа или уменьшение числа единиц]" \
            "updateOrderStatus[Изменение статуса одного заказа]" \
            "updateOrderStatuses[Изменение статусов нескольких заказов]" \
            "updatePrices[Установка цен на товары в конкретном магазине]" \
            "updatePromoOffers[Добавление товаров в акцию или изменение их цен]" \
            "updateStocks[Передача информации об остатках]" \
            "verifyOrderEac[Передача кода подтверждения]"             "addHiddenOffers[Скрытие товаров и настройки скрытия]" \
            "addOffersToArchive[Добавление товаров в архив]" \
            "calculateTariffs[Калькулятор стоимости услуг]" \
            "confirmBusinessPrices[Удаление товара из карантина по цене в кабинете]" \
            "confirmCampaignPrices[Удаление товара из карантина по цене в магазине]" \
            "confirmShipment[Подтверждение отгрузки]" \
            "createChat[Создание нового чата с покупателем]" \
            "deleteCampaignOffers[Удаление товаров из ассортимента магазина]" \
            "deleteGoodsFeedbackComment[Удаление комментария к отзыву]" \
            "deleteHiddenOffers[Возобновление показа товаров]" \
            "deleteOffers[Удаление товаров из каталога]" \
            "deleteOffersFromArchive[Удаление товаров из архива]" \
            "deletePromoOffers[Удаление товаров из акции]" \
            "downloadShipmentAct[Получение акта приема-передачи]" \
            "downloadShipmentDiscrepancyAct[Получение акта расхождений]" \
            "downloadShipmentInboundAct[Получение фактического акта приема-передачи]" \
            "downloadShipmentPalletLabels[Ярлыки для доверительной приемки (FBS)]" \
            "downloadShipmentReceptionTransferAct[Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее]" \
            "downloadShipmentTransportationWaybill[Получение транспортной накладной]" \
            "generateBoostConsolidatedReport[Отчет по бусту продаж]" \
            "generateCompetitorsPositionReport[Отчет «Конкурентная позиция»]" \
            "generateGoodsFeedbackReport[Отчет по отзывам о товарах]" \
            "generateGoodsRealizationReport[Отчет по реализации]" \
            "generateMassOrderLabelsReport[Готовые ярлыки‑наклейки на все коробки в нескольких заказах]" \
            "generateOrderLabel[Готовый ярлык‑наклейка для коробки в заказе]" \
            "generateOrderLabels[Готовые ярлыки‑наклейки на все коробки в одном заказе]" \
            "generatePricesReport[Отчет «Цены на рынке»]" \
            "generateShelfsStatisticsReport[Отчет по полкам]" \
            "generateShipmentListDocumentReport[Получение листа сборки]" \
            "generateShowsSalesReport[Отчет «Аналитика продаж»]" \
            "generateStocksOnWarehousesReport[Отчет по остаткам на складах]" \
            "generateUnitedMarketplaceServicesReport[Отчет по стоимости услуг]" \
            "generateUnitedNettingReport[Отчет по платежам]" \
            "generateUnitedOrdersReport[Отчет по заказам]" \
            "getAllOffers[Все предложения магазина]" \
            "getBidsInfoForBusiness[Информация об установленных ставках]" \
            "getBidsRecommendations[Рекомендованные ставки для заданных товаров]" \
            "getBusinessQuarantineOffers[Список товаров, находящихся в карантине по цене в кабинете]" \
            "getBusinessSettings[Настройки кабинета]" \
            "getCampaign[Информация о магазине]" \
            "getCampaignLogins[Логины, связанные с магазином]" \
            "getCampaignOffers[Информация о товарах, которые размещены в заданном магазине]" \
            "getCampaignQuarantineOffers[Список товаров, находящихся в карантине по цене в магазине]" \
            "getCampaignRegion[Регион магазина]" \
            "getCampaignSettings[Настройки магазина]" \
            "getCampaigns[Список магазинов пользователя]" \
            "getCampaignsByLogin[Магазины, доступные логину]" \
            "getCategoriesMaxSaleQuantum[Лимит на установку кванта продажи и минимального количества товаров в заказе]" \
            "getCategoriesTree[Дерево категорий]" \
            "getCategoryContentParameters[Списки характеристик товаров по категориям]" \
            "getChatHistory[Получение истории сообщений в чате]" \
            "getChats[Получение доступных чатов]" \
            "getDeliveryServices[Справочник служб доставки]" \
            "getFeed[Информация о прайс-листе]" \
            "getFeedIndexLogs[Отчет по индексации прайс-листа]" \
            "getFeedbackAndCommentUpdates[Новые и обновленные отзывы о магазине]" \
            "getFeeds[Список прайс-листов магазина]" \
            "getGoodsFeedbackComments[Получение комментариев к отзыву]" \
            "getGoodsFeedbacks[Получение отзывов о товарах продавца]" \
            "getGoodsStats[Отчет по товарам]" \
            "getHiddenOffers[Информация о скрытых вами товарах]" \
            "getOfferCardsContentStatus[Получение информации о заполненности карточек магазина]" \
            "getOfferMappingEntries[Список товаров в каталоге]" \
            "getOfferMappings[Информация о товарах в каталоге]" \
            "getOfferRecommendations[Рекомендации Маркета, касающиеся цен]" \
            "getOffers[Предложения магазина]" \
            "getOrder[Информация об одном заказе]" \
            "getOrderBusinessBuyerInfo[Информация о покупателе — юридическом лице]" \
            "getOrderBusinessDocumentsInfo[Информация о документах]" \
            "getOrderLabelsData[Данные для самостоятельного изготовления ярлыков]" \
            "getOrders[Информация о нескольких заказах]" \
            "getOrdersStats[Детальная информация по заказам]" \
            "getPrices[Список цен]" \
            "getPricesByOfferIds[Просмотр цен на указанные товары в магазине]" \
            "getPromoOffers[Получение списка товаров, которые участвуют или могут участвовать в акции]" \
            "getPromos[Получение списка акций]" \
            "getQualityRatingDetails[Заказы, которые повлияли на индекс качества]" \
            "getQualityRatings[Индекс качества магазинов]" \
            "getReportInfo[Получение заданного отчета]" \
            "getReturn[Информация о невыкупе или возврате]" \
            "getReturnApplication[Получение заявления на возврат]" \
            "getReturnPhoto[Получение фотографии возврата]" \
            "getReturns[Список невыкупов и возвратов]" \
            "getShipment[Получение информации об одной отгрузке]" \
            "getShipmentOrdersInfo[Получение информации о возможности печати ярлыков (FBS)]" \
            "getStocks[Информация об остатках и оборачиваемости]" \
            "getSuggestedOfferMappingEntries[Рекомендованные карточки для товаров]" \
            "getSuggestedOfferMappings[Просмотр карточек на Маркете, которые подходят вашим товарам]" \
            "getSuggestedPrices[Цены для продвижения товаров]" \
            "getWarehouses[Список складов и групп складов]" \
            "provideOrderItemIdentifiers[Передача кодов маркировки единиц товара]" \
            "putBidsForBusiness[Включение буста продаж и установка ставок]" \
            "putBidsForCampaign[Включение буста продаж и установка ставок для магазина]" \
            "refreshFeed[Сообщить, что прайс-лист обновился]" \
            "searchRegionChildren[Информация о дочерних регионах]" \
            "searchRegionsById[Информация о регионе]" \
            "searchRegionsByName[Поиск регионов по их имени]" \
            "searchShipments[Получение информации о нескольких отгрузках]" \
            "sendFileToChat[Отправка файла в чат]" \
            "sendMessageToChat[Отправка сообщения в чат]" \
            "setFeedParams[Изменение параметров прайс-листа]" \
            "setOrderBoxLayout[Подготовка заказа]" \
            "setOrderShipmentBoxes[Передача количества грузовых мест в заказе]" \
            "setShipmentPalletsCount[Передача количества упаковок в отгрузке]" \
            "skipGoodsFeedbacksReaction[Отказ от ответа на отзывы]" \
            "transferOrdersFromShipment[Перенос заказов в следующую отгрузку]" \
            "updateBusinessPrices[Установка цен на товары во всех магазинах]" \
            "updateCampaignOffers[Изменение условий продажи товаров в магазине]" \
            "updateGoodsFeedbackComment[Добавление нового или изменение созданного комментария]" \
            "updateOfferContent[Редактирование категорийных характеристик товара]" \
            "updateOfferMappingEntries[Добавление и редактирование товаров в каталоге]" \
            "updateOfferMappings[Добавление товаров в каталог и изменение информации о них]" \
            "updateOrderItems[Удаление товара из заказа или уменьшение числа единиц]" \
            "updateOrderStatus[Изменение статуса одного заказа]" \
            "updateOrderStatuses[Изменение статусов нескольких заказов]" \
            "updatePrices[Установка цен на товары в конкретном магазине]" \
            "updatePromoOffers[Добавление товаров в акцию или изменение их цен]" \
            "updateStocks[Передача информации об остатках]"             "addHiddenOffers[Скрытие товаров и настройки скрытия]" \
            "addOffersToArchive[Добавление товаров в архив]" \
            "calculateTariffs[Калькулятор стоимости услуг]" \
            "confirmBusinessPrices[Удаление товара из карантина по цене в кабинете]" \
            "confirmCampaignPrices[Удаление товара из карантина по цене в магазине]" \
            "createChat[Создание нового чата с покупателем]" \
            "deleteCampaignOffers[Удаление товаров из ассортимента магазина]" \
            "deleteGoodsFeedbackComment[Удаление комментария к отзыву]" \
            "deleteHiddenOffers[Возобновление показа товаров]" \
            "deleteOffers[Удаление товаров из каталога]" \
            "deleteOffersFromArchive[Удаление товаров из архива]" \
            "deletePromoOffers[Удаление товаров из акции]" \
            "generateBoostConsolidatedReport[Отчет по бусту продаж]" \
            "generateCompetitorsPositionReport[Отчет «Конкурентная позиция»]" \
            "generateGoodsFeedbackReport[Отчет по отзывам о товарах]" \
            "generateGoodsMovementReport[Отчет по движению товаров]" \
            "generateGoodsRealizationReport[Отчет по реализации]" \
            "generateGoodsTurnoverReport[Отчет по оборачиваемости]" \
            "generatePricesReport[Отчет «Цены на рынке»]" \
            "generateShelfsStatisticsReport[Отчет по полкам]" \
            "generateShowsSalesReport[Отчет «Аналитика продаж»]" \
            "generateStocksOnWarehousesReport[Отчет по остаткам на складах]" \
            "generateUnitedMarketplaceServicesReport[Отчет по стоимости услуг]" \
            "generateUnitedNettingReport[Отчет по платежам]" \
            "generateUnitedOrdersReport[Отчет по заказам]" \
            "getAllOffers[Все предложения магазина]" \
            "getBidsInfoForBusiness[Информация об установленных ставках]" \
            "getBidsRecommendations[Рекомендованные ставки для заданных товаров]" \
            "getBusinessQuarantineOffers[Список товаров, находящихся в карантине по цене в кабинете]" \
            "getBusinessSettings[Настройки кабинета]" \
            "getCampaign[Информация о магазине]" \
            "getCampaignLogins[Логины, связанные с магазином]" \
            "getCampaignOffers[Информация о товарах, которые размещены в заданном магазине]" \
            "getCampaignQuarantineOffers[Список товаров, находящихся в карантине по цене в магазине]" \
            "getCampaignRegion[Регион магазина]" \
            "getCampaignSettings[Настройки магазина]" \
            "getCampaigns[Список магазинов пользователя]" \
            "getCampaignsByLogin[Магазины, доступные логину]" \
            "getCategoriesMaxSaleQuantum[Лимит на установку кванта продажи и минимального количества товаров в заказе]" \
            "getCategoriesTree[Дерево категорий]" \
            "getCategoryContentParameters[Списки характеристик товаров по категориям]" \
            "getChatHistory[Получение истории сообщений в чате]" \
            "getChats[Получение доступных чатов]" \
            "getFeed[Информация о прайс-листе]" \
            "getFeedIndexLogs[Отчет по индексации прайс-листа]" \
            "getFeedbackAndCommentUpdates[Новые и обновленные отзывы о магазине]" \
            "getFeeds[Список прайс-листов магазина]" \
            "getFulfillmentWarehouses[Идентификаторы складов Маркета (FBY)]" \
            "getGoodsFeedbackComments[Получение комментариев к отзыву]" \
            "getGoodsFeedbacks[Получение отзывов о товарах продавца]" \
            "getGoodsStats[Отчет по товарам]" \
            "getHiddenOffers[Информация о скрытых вами товарах]" \
            "getOfferCardsContentStatus[Получение информации о заполненности карточек магазина]" \
            "getOfferMappingEntries[Список товаров в каталоге]" \
            "getOfferMappings[Информация о товарах в каталоге]" \
            "getOfferRecommendations[Рекомендации Маркета, касающиеся цен]" \
            "getOffers[Предложения магазина]" \
            "getOrder[Информация об одном заказе]" \
            "getOrderBusinessBuyerInfo[Информация о покупателе — юридическом лице]" \
            "getOrderBusinessDocumentsInfo[Информация о документах]" \
            "getOrders[Информация о нескольких заказах]" \
            "getOrdersStats[Детальная информация по заказам]" \
            "getPrices[Список цен]" \
            "getPricesByOfferIds[Просмотр цен на указанные товары в магазине]" \
            "getPromoOffers[Получение списка товаров, которые участвуют или могут участвовать в акции]" \
            "getPromos[Получение списка акций]" \
            "getQualityRatings[Индекс качества магазинов]" \
            "getReportInfo[Получение заданного отчета]" \
            "getReturn[Информация о невыкупе или возврате]" \
            "getReturnPhoto[Получение фотографии возврата]" \
            "getReturns[Список невыкупов и возвратов]" \
            "getStocks[Информация об остатках и оборачиваемости]" \
            "getSuggestedOfferMappingEntries[Рекомендованные карточки для товаров]" \
            "getSuggestedOfferMappings[Просмотр карточек на Маркете, которые подходят вашим товарам]" \
            "getSuggestedPrices[Цены для продвижения товаров]" \
            "putBidsForBusiness[Включение буста продаж и установка ставок]" \
            "putBidsForCampaign[Включение буста продаж и установка ставок для магазина]" \
            "refreshFeed[Сообщить, что прайс-лист обновился]" \
            "searchRegionChildren[Информация о дочерних регионах]" \
            "searchRegionsById[Информация о регионе]" \
            "searchRegionsByName[Поиск регионов по их имени]" \
            "sendFileToChat[Отправка файла в чат]" \
            "sendMessageToChat[Отправка сообщения в чат]" \
            "setFeedParams[Изменение параметров прайс-листа]" \
            "skipGoodsFeedbacksReaction[Отказ от ответа на отзывы]" \
            "updateBusinessPrices[Установка цен на товары во всех магазинах]" \
            "updateCampaignOffers[Изменение условий продажи товаров в магазине]" \
            "updateGoodsFeedbackComment[Добавление нового или изменение созданного комментария]" \
            "updateOfferContent[Редактирование категорийных характеристик товара]" \
            "updateOfferMappingEntries[Добавление и редактирование товаров в каталоге]" \
            "updateOfferMappings[Добавление товаров в каталог и изменение информации о них]" \
            "updatePrices[Установка цен на товары в конкретном магазине]" \
            "updatePromoOffers[Добавление товаров в акцию или изменение их цен]"             "getFeedbackAndCommentUpdates[Новые и обновленные отзывы о магазине]"             "getFeed[Информация о прайс-листе]" \
            "getFeedIndexLogs[Отчет по индексации прайс-листа]" \
            "getFeeds[Список прайс-листов магазина]" \
            "refreshFeed[Сообщить, что прайс-лист обновился]" \
            "setFeedParams[Изменение параметров прайс-листа]"             "deleteGoodsFeedbackComment[Удаление комментария к отзыву]" \
            "getGoodsFeedbackComments[Получение комментариев к отзыву]" \
            "getGoodsFeedbacks[Получение отзывов о товарах продавца]" \
            "skipGoodsFeedbacksReaction[Отказ от ответа на отзывы]" \
            "updateGoodsFeedbackComment[Добавление нового или изменение созданного комментария]"             "getGoodsStats[Отчет по товарам]"             "addHiddenOffers[Скрытие товаров и настройки скрытия]" \
            "deleteHiddenOffers[Возобновление показа товаров]" \
            "getHiddenOffers[Информация о скрытых вами товарах]"             "getModel[Информация об одной модели]" \
            "getModelOffers[Список предложений для одной модели]" \
            "getModels[Информация о нескольких моделях]" \
            "getModelsOffers[Список предложений для нескольких моделей]" \
            "searchModels[Поиск модели товара]"             "getOfferMappingEntries[Список товаров в каталоге]" \
            "getSuggestedOfferMappingEntries[Рекомендованные карточки для товаров]" \
            "updateOfferMappingEntries[Добавление и редактирование товаров в каталоге]"             "deleteCampaignOffers[Удаление товаров из ассортимента магазина]" \
            "getAllOffers[Все предложения магазина]" \
            "getCampaignOffers[Информация о товарах, которые размещены в заданном магазине]" \
            "getOfferRecommendations[Рекомендации Маркета, касающиеся цен]" \
            "getOffers[Предложения магазина]" \
            "updateCampaignOffers[Изменение условий продажи товаров в магазине]"             "getOrderBusinessBuyerInfo[Информация о покупателе — юридическом лице]" \
            "getOrderBusinessDocumentsInfo[Информация о документах]"             "getOrderBuyerInfo[Информация о покупателе — физическом лице]" \
            "setOrderDeliveryDate[Изменение даты доставки заказа]" \
            "setOrderDeliveryTrackCode[Передача трек‑номера посылки]" \
            "updateOrderStorageLimit[Продление срока хранения заказа]" \
            "verifyOrderEac[Передача кода подтверждения]"             "generateOrderLabel[Готовый ярлык‑наклейка для коробки в заказе]" \
            "generateOrderLabels[Готовые ярлыки‑наклейки на все коробки в одном заказе]" \
            "getOrderLabelsData[Данные для самостоятельного изготовления ярлыков]"             "acceptOrderCancellation[Отмена заказа покупателем]" \
            "getOrder[Информация об одном заказе]" \
            "getOrders[Информация о нескольких заказах]" \
            "provideOrderDigitalCodes[Передача ключей цифровых товаров]" \
            "provideOrderItemIdentifiers[Передача кодов маркировки единиц товара]" \
            "setOrderBoxLayout[Подготовка заказа]" \
            "setOrderShipmentBoxes[Передача количества грузовых мест в заказе]" \
            "updateOrderItems[Удаление товара из заказа или уменьшение числа единиц]" \
            "updateOrderStatus[Изменение статуса одного заказа]" \
            "updateOrderStatuses[Изменение статусов нескольких заказов]"             "getOrdersStats[Детальная информация по заказам]"             "deleteOutletLicenses[Удаление лицензий для точек продаж]" \
            "getOutletLicenses[Информация о лицензиях для точек продаж]" \
            "updateOutletLicenses[Создание и изменение лицензий для точек продаж]"             "createOutlet[Создание точки продаж]" \
            "deleteOutlet[Удаление точки продаж]" \
            "getOutlet[Информация об одной точке продаж]" \
            "getOutlets[Информация о нескольких точках продаж]" \
            "updateOutlet[Изменение информации о точке продаж]"             "confirmBusinessPrices[Удаление товара из карантина по цене в кабинете]" \
            "confirmCampaignPrices[Удаление товара из карантина по цене в магазине]" \
            "getBusinessQuarantineOffers[Список товаров, находящихся в карантине по цене в кабинете]" \
            "getCampaignQuarantineOffers[Список товаров, находящихся в карантине по цене в магазине]"             "getPrices[Список цен]" \
            "getPricesByOfferIds[Просмотр цен на указанные товары в магазине]" \
            "getSuggestedPrices[Цены для продвижения товаров]" \
            "updateBusinessPrices[Установка цен на товары во всех магазинах]" \
            "updatePrices[Установка цен на товары в конкретном магазине]"             "deletePromoOffers[Удаление товаров из акции]" \
            "getPromoOffers[Получение списка товаров, которые участвуют или могут участвовать в акции]" \
            "getPromos[Получение списка акций]" \
            "updatePromoOffers[Добавление товаров в акцию или изменение их цен]"             "getQualityRatingDetails[Заказы, которые повлияли на индекс качества]" \
            "getQualityRatings[Индекс качества магазинов]"             "searchRegionChildren[Информация о дочерних регионах]" \
            "searchRegionsById[Информация о регионе]" \
            "searchRegionsByName[Поиск регионов по их имени]"             "generateBoostConsolidatedReport[Отчет по бусту продаж]" \
            "generateCompetitorsPositionReport[Отчет «Конкурентная позиция»]" \
            "generateGoodsFeedbackReport[Отчет по отзывам о товарах]" \
            "generateGoodsMovementReport[Отчет по движению товаров]" \
            "generateGoodsRealizationReport[Отчет по реализации]" \
            "generateGoodsTurnoverReport[Отчет по оборачиваемости]" \
            "generateMassOrderLabelsReport[Готовые ярлыки‑наклейки на все коробки в нескольких заказах]" \
            "generatePricesReport[Отчет «Цены на рынке»]" \
            "generateShelfsStatisticsReport[Отчет по полкам]" \
            "generateShipmentListDocumentReport[Получение листа сборки]" \
            "generateShowsSalesReport[Отчет «Аналитика продаж»]" \
            "generateStocksOnWarehousesReport[Отчет по остаткам на складах]" \
            "generateUnitedMarketplaceServicesReport[Отчет по стоимости услуг]" \
            "generateUnitedNettingReport[Отчет по платежам]" \
            "generateUnitedOrdersReport[Отчет по заказам]" \
            "getReportInfo[Получение заданного отчета]"             "getReturn[Информация о невыкупе или возврате]" \
            "getReturnApplication[Получение заявления на возврат]" \
            "getReturnPhoto[Получение фотографии возврата]" \
            "getReturns[Список невыкупов и возвратов]" \
            "setReturnDecision[Принятие или изменение решения по возврату]" \
            "submitReturnDecision[Подтверждение решения по возврату]"             "confirmShipment[Подтверждение отгрузки]" \
            "downloadShipmentAct[Получение акта приема-передачи]" \
            "downloadShipmentDiscrepancyAct[Получение акта расхождений]" \
            "downloadShipmentInboundAct[Получение фактического акта приема-передачи]" \
            "downloadShipmentPalletLabels[Ярлыки для доверительной приемки (FBS)]" \
            "downloadShipmentReceptionTransferAct[Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее]" \
            "downloadShipmentTransportationWaybill[Получение транспортной накладной]" \
            "getShipment[Получение информации об одной отгрузке]" \
            "getShipmentOrdersInfo[Получение информации о возможности печати ярлыков (FBS)]" \
            "searchShipments[Получение информации о нескольких отгрузках]" \
            "setShipmentPalletsCount[Передача количества упаковок в отгрузке]" \
            "transferOrdersFromShipment[Перенос заказов в следующую отгрузку]"             "getStocks[Информация об остатках и оборачиваемости]" \
            "updateStocks[Передача информации об остатках]"             "calculateTariffs[Калькулятор стоимости услуг]"             "getFulfillmentWarehouses[Идентификаторы складов Маркета (FBY)]" \
            "getWarehouses[Список складов и групп складов]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      getBidsInfoForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addOffersToArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffersFromArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessSettings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignLogins)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignRegion)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignSettings)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaigns)
        local -a _op_arguments
        _op_arguments=(
                    "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignsByLogin)
        local -a _op_arguments
        _op_arguments=(
          "login=:[PATH] Логин пользователя."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesMaxSaleQuantum)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesTree)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChatHistory)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChats)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendFileToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendMessageToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoryContentParameters)
        local -a _op_arguments
        _op_arguments=(
          "categoryId=:[PATH] Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferCardsContentStatus)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferContent)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      acceptOrderCancellation)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addOffersToArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      calculateTariffs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmCampaignPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffersFromArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"outletId=:[PATH] Идентификатор точки продаж."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOutletLicenses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "ids=:[QUERY] Список идентификаторов лицензий."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deletePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateBoostConsolidatedReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateCompetitorsPositionReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsFeedbackReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateMassOrderLabelsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabel)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Идентификатор грузоместа."
"boxId=:[PATH] Идентификатор коробки."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabels)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generatePricesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShelfsStatisticsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShowsSalesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateStocksOnWarehousesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedMarketplaceServicesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedNettingReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedOrdersReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "feedId=:[QUERY] Идентификатор прайс-листа."
"chunk=:[QUERY] Номер сегмента с результатами.

Значение по умолчанию: &#39;0&#39;.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#39;chunk&#x3D;0&#39; и т. д.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsInfoForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessSettings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignLogins)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignRegion)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignSettings)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaigns)
        local -a _op_arguments
        _op_arguments=(
                    "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignsByLogin)
        local -a _op_arguments
        _op_arguments=(
          "login=:[PATH] Логин пользователя."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesMaxSaleQuantum)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesTree)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoryContentParameters)
        local -a _op_arguments
        _op_arguments=(
          "categoryId=:[PATH] Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChatHistory)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChats)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDeliveryServices)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedIndexLogs)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
          "limit=:[QUERY] Количество значений на одной странице."
"published_time_from=:[QUERY] Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Значение по умолчанию: последние восемь дней со времени отправки запроса."
"published_time_to=:[QUERY] Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-31T00:42:42+03:00&#39;.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#39;published_time_to&#39;. Значение параметра не должно быть датой из будущего.

{% endnote %}"
"status=:[QUERY] Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* &#39;ERROR&#39; — произошли ошибки.
* &#39;OK&#39; — обработан без ошибок.
* &#39;WARNING&#39; — наблюдались некритичные проблемы."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedbackAndCommentUpdates)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"from_date=:[QUERY] Начальная дата обновления отзывов.

Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.

Формат даты: &#39;ГГГГ-ММ-ДД&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeeds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbackComments)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbacks)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор скрытого предложения."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"offset=:[QUERY] Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром &#39;limit&#39;.

Если задан &#39;offset&#39;, параметры &#39;page_number&#39; и &#39;page_size&#39; игнорируются.

&#39;offset&#39; игнорируется, если задан &#39;page_token&#39;."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModel)
        local -a _op_arguments
        _op_arguments=(
          "modelId=:[PATH] Идентификатор модели товара."
          "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModelOffers)
        local -a _op_arguments
        _op_arguments=(
          "modelId=:[PATH] Идентификатор модели товара."
          "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
"orderByPrice=:[QUERY] Направление сортировки по цене.

Возможные значения:
* &#39;ASC&#39; — сортировка по возрастанию.
* &#39;DESC&#39; — сортировка по убыванию.

Значение по умолчанию: предложения выводятся в произвольном порядке."
"count=:[QUERY] Количество предложений на странице ответа."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModels)
        local -a _op_arguments
        _op_arguments=(
                    "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModelsOffers)
        local -a _op_arguments
        _op_arguments=(
                    "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
"orderByPrice=:[QUERY] Направление сортировки по цене.

Возможные значения:
* &#39;ASC&#39; — сортировка по возрастанию.
* &#39;DESC&#39; — сортировка по убыванию.

Значение по умолчанию: предложения выводятся в произвольном порядке."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferCardsContentStatus)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор товара в каталоге."
"shop_sku=:[QUERY] Ваш SKU товара.

Параметр может быть указан несколько раз, например:

&#39;&#39;&#39;
...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"mapping_kind=:[QUERY] Тип маппинга."
"status=:[QUERY] Фильтрация по статусу публикации товара:

* &#39;READY&#39; — товар прошел модерацию.
* &#39;IN_WORK&#39; — товар проходит модерацию.
* &#39;NEED_CONTENT&#39; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* &#39;NEED_INFO&#39; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* &#39;REJECTED&#39; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* &#39;SUSPENDED&#39; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* &#39;OTHER&#39; — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...status&#x3D;READY,IN_WORK...
...status&#x3D;READY&amp;status&#x3D;IN_WORK...
&#39;&#39;&#39;

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"availability=:[QUERY] Фильтрация по планам поставок товара:

* &#39;ACTIVE&#39; — поставки будут.
* &#39;INACTIVE&#39; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* &#39;DELISTED&#39; — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...availability&#x3D;INACTIVE,DELISTED...
...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"category_id=:[QUERY] Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...category_id&#x3D;14727164,14382343...
...category_id&#x3D;14727164&amp;category_id&#x3D;14382343...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"vendor=:[QUERY] Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...vendor&#x3D;Aqua%20Minerale,Borjomi...
...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi...
&#39;&#39;&#39;

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "query=:[QUERY] Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете."
"feedId=:[QUERY] Идентификатор прайс-листа."
"shopCategoryId=:[QUERY] Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API."
"currency=:[QUERY] Валюта, в которой указана цена предложения.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна."
"matched=true:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
          "matched=false:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrder)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessDocumentsInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderLabelsData)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrders)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "orderIds=:[QUERY] Фильтрация заказов по идентификаторам.
&lt;br&gt;&lt;br&gt;
⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым."
"status=:[QUERY] Статус заказа:

* &#39;CANCELLED&#39; — заказ отменен.

* &#39;DELIVERED&#39; — заказ получен покупателем.

* &#39;DELIVERY&#39; — заказ передан в службу доставки.

* &#39;PICKUP&#39; — заказ доставлен в пункт самовывоза.

* &#39;PROCESSING&#39; — заказ находится в обработке.

* &#39;UNPAID&#39; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"substatus=:[QUERY] Этап обработки заказа (если он имеет статус &#39;PROCESSING&#39;) или причина отмены заказа (если он имеет статус &#39;CANCELLED&#39;).

Возможные значения для заказа в статусе &#39;PROCESSING&#39;:

* &#39;STARTED&#39; — заказ подтвержден, его можно начать обрабатывать.
* &#39;READY_TO_SHIP&#39; — заказ собран и готов к отправке.
* &#39;SHIPPED&#39; — заказ передан службе доставки.

Возможные значения для заказа в статусе &#39;CANCELLED&#39;:

* &#39;DELIVERY_SERVICE_UNDELIVERED&#39; — служба доставки не смогла доставить заказ.

* &#39;PROCESSING_EXPIRED&#39; — значение более не используется.

* &#39;REPLACING_ORDER&#39; — покупатель решил заменить товар другим по собственной инициативе.

* &#39;RESERVATION_EXPIRED&#39; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.

* &#39;RESERVATION_FAILED&#39; — Маркет не может продолжить дальнейшую обработку заказа.

* &#39;SHOP_FAILED&#39; — магазин не может выполнить заказ.

* &#39;USER_CHANGED_MIND&#39; — покупатель отменил заказ по личным причинам.

* &#39;USER_NOT_PAID&#39; — покупатель не оплатил заказ (для типа оплаты &#39;PREPAID&#39;) в течение 30 минут.

* &#39;USER_REFUSED_DELIVERY&#39; — покупателя не устроили условия доставки.

* &#39;USER_REFUSED_PRODUCT&#39; — покупателю не подошел товар.

* &#39;USER_REFUSED_QUALITY&#39; — покупателя не устроило качество товара.

* &#39;USER_UNREACHABLE&#39; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:

  * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
  * перерыв между первым и третьим звонком не менее 90 минут;
  * соединение не короче 5 секунд.

  Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
* &#39;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#39; — покупатель хочет получить заказ в другой день.
* &#39;CANCELLED_COURIER_NOT_FOUND&#39; — не удалось найти курьера.

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"fromDate=:[QUERY] Начальная дата для фильтрации заказов по дате оформления.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;toDate&#39;) должно быть не больше 30 дней.

Значение по умолчанию: 30 дней назад от текущей даты."
"toDate=:[QUERY] Конечная дата для фильтрации заказов по дате оформления.

Показываются заказы, созданные до 00:00 указанного дня.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;fromDate&#39;) и конечной датой должно быть не больше 30 дней.

Значение по умолчанию: текущая дата."
"supplierShipmentDateFrom=:[QUERY] Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;supplierShipmentDateTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"supplierShipmentDateTo=:[QUERY] Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;supplierShipmentDateFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"updatedAtFrom=:[QUERY] Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной и конечной датой (параметр &#39;updatedAtTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"updatedAtTo=:[QUERY] Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной (параметр &#39;updatedAtFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"dispatchType=:[QUERY] Способ отгрузки"
"fake=true:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
          "fake=false:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
"hasCis=true:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
          "hasCis=false:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
"onlyWaitingForCancellationApprove=true:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
          "onlyWaitingForCancellationApprove=false:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
"onlyEstimatedDelivery=true:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
          "onlyEstimatedDelivery=false:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
"buyerType=:[QUERY] Фильтрация заказов по типу покупателя."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrdersStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"outletId=:[PATH] Идентификатор точки продаж."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOutletLicenses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "outletIds=:[QUERY] Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.

В запросе должен быть либо параметр &#39;outletIds&#39;, либо параметр &#39;ids&#39;. Запрос с обоими параметрами или без них приведет к ошибке."
"ids=:[QUERY] Список идентификаторов лицензий."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOutlets)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"region_id=:[QUERY] Идентификатор региона.
Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов.
Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md)."
"shop_outlet_code=:[QUERY] Идентификатор точки продаж, присвоенный магазином."
"regionId=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Для указания региона используйте &#39;region_id&#39;.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"archived=true:[QUERY] Фильтр по нахождению в архиве."
          "archived=false:[QUERY] Фильтр по нахождению в архиве."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPricesByOfferIds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromos)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatingDetails)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReportInfo)
        local -a _op_arguments
        _op_arguments=(
          "reportId=:[PATH] Идентификатор отчета, который вы получили после запуска генерации."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturn)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnApplication)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnPhoto)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
"itemId=:[PATH] Идентификатор товара в возврате."
"imageHash=:[PATH] Хеш ссылки изображения для загрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturns)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"orderIds=:[QUERY] Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50."
"statuses=:[QUERY] Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую."
"type=:[QUERY] Тип заказа для фильтрации:

* &#39;RETURN&#39; — возврат.

* &#39;UNREDEEMED&#39; — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы."
"fromDate=:[QUERY] Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"toDate=:[QUERY] Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"from_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;fromDate&#39;.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления."
"to_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;toDate&#39;.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getWarehouses)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      provideOrderDigitalCodes)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      provideOrderItemIdentifiers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      refreshFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchModels)
        local -a _op_arguments
        _op_arguments=(
                    "query=:[QUERY] Поисковый запрос по названию модели товара."
"regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionChildren)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsById)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsByName)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] Название региона.

Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#39;Москва&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendFileToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendMessageToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setFeedParams)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderBoxLayout)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderDeliveryDate)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderDeliveryTrackCode)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderShipmentBoxes)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setReturnDecision)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      skipGoodsFeedbacksReaction)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitReturnDecision)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferContent)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderItems)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatus)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatuses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStorageLimit)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"outletId=:[PATH] Идентификатор точки продаж."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOutletLicenses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDeliveryServices)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addOffersToArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      calculateTariffs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmCampaignPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffersFromArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deletePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateBoostConsolidatedReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateCompetitorsPositionReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsFeedbackReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsRealizationReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateMassOrderLabelsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabel)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Идентификатор грузоместа."
"boxId=:[PATH] Идентификатор коробки."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabels)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generatePricesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShelfsStatisticsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShowsSalesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateStocksOnWarehousesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedMarketplaceServicesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedNettingReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedOrdersReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "feedId=:[QUERY] Идентификатор прайс-листа."
"chunk=:[QUERY] Номер сегмента с результатами.

Значение по умолчанию: &#39;0&#39;.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#39;chunk&#x3D;0&#39; и т. д.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsInfoForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessSettings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignLogins)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignRegion)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignSettings)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaigns)
        local -a _op_arguments
        _op_arguments=(
                    "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignsByLogin)
        local -a _op_arguments
        _op_arguments=(
          "login=:[PATH] Логин пользователя."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesMaxSaleQuantum)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesTree)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoryContentParameters)
        local -a _op_arguments
        _op_arguments=(
          "categoryId=:[PATH] Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChatHistory)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChats)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDeliveryServices)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedIndexLogs)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
          "limit=:[QUERY] Количество значений на одной странице."
"published_time_from=:[QUERY] Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Значение по умолчанию: последние восемь дней со времени отправки запроса."
"published_time_to=:[QUERY] Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-31T00:42:42+03:00&#39;.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#39;published_time_to&#39;. Значение параметра не должно быть датой из будущего.

{% endnote %}"
"status=:[QUERY] Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* &#39;ERROR&#39; — произошли ошибки.
* &#39;OK&#39; — обработан без ошибок.
* &#39;WARNING&#39; — наблюдались некритичные проблемы."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedbackAndCommentUpdates)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"from_date=:[QUERY] Начальная дата обновления отзывов.

Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.

Формат даты: &#39;ГГГГ-ММ-ДД&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeeds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbackComments)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbacks)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор скрытого предложения."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"offset=:[QUERY] Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром &#39;limit&#39;.

Если задан &#39;offset&#39;, параметры &#39;page_number&#39; и &#39;page_size&#39; игнорируются.

&#39;offset&#39; игнорируется, если задан &#39;page_token&#39;."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferCardsContentStatus)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор товара в каталоге."
"shop_sku=:[QUERY] Ваш SKU товара.

Параметр может быть указан несколько раз, например:

&#39;&#39;&#39;
...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"mapping_kind=:[QUERY] Тип маппинга."
"status=:[QUERY] Фильтрация по статусу публикации товара:

* &#39;READY&#39; — товар прошел модерацию.
* &#39;IN_WORK&#39; — товар проходит модерацию.
* &#39;NEED_CONTENT&#39; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* &#39;NEED_INFO&#39; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* &#39;REJECTED&#39; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* &#39;SUSPENDED&#39; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* &#39;OTHER&#39; — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...status&#x3D;READY,IN_WORK...
...status&#x3D;READY&amp;status&#x3D;IN_WORK...
&#39;&#39;&#39;

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"availability=:[QUERY] Фильтрация по планам поставок товара:

* &#39;ACTIVE&#39; — поставки будут.
* &#39;INACTIVE&#39; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* &#39;DELISTED&#39; — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...availability&#x3D;INACTIVE,DELISTED...
...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"category_id=:[QUERY] Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...category_id&#x3D;14727164,14382343...
...category_id&#x3D;14727164&amp;category_id&#x3D;14382343...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"vendor=:[QUERY] Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...vendor&#x3D;Aqua%20Minerale,Borjomi...
...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi...
&#39;&#39;&#39;

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "query=:[QUERY] Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете."
"feedId=:[QUERY] Идентификатор прайс-листа."
"shopCategoryId=:[QUERY] Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API."
"currency=:[QUERY] Валюта, в которой указана цена предложения.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна."
"matched=true:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
          "matched=false:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrder)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessDocumentsInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderLabelsData)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrders)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "orderIds=:[QUERY] Фильтрация заказов по идентификаторам.
&lt;br&gt;&lt;br&gt;
⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым."
"status=:[QUERY] Статус заказа:

* &#39;CANCELLED&#39; — заказ отменен.

* &#39;DELIVERED&#39; — заказ получен покупателем.

* &#39;DELIVERY&#39; — заказ передан в службу доставки.

* &#39;PICKUP&#39; — заказ доставлен в пункт самовывоза.

* &#39;PROCESSING&#39; — заказ находится в обработке.

* &#39;UNPAID&#39; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"substatus=:[QUERY] Этап обработки заказа (если он имеет статус &#39;PROCESSING&#39;) или причина отмены заказа (если он имеет статус &#39;CANCELLED&#39;).

Возможные значения для заказа в статусе &#39;PROCESSING&#39;:

* &#39;STARTED&#39; — заказ подтвержден, его можно начать обрабатывать.
* &#39;READY_TO_SHIP&#39; — заказ собран и готов к отправке.
* &#39;SHIPPED&#39; — заказ передан службе доставки.

Возможные значения для заказа в статусе &#39;CANCELLED&#39;:

* &#39;DELIVERY_SERVICE_UNDELIVERED&#39; — служба доставки не смогла доставить заказ.

* &#39;PROCESSING_EXPIRED&#39; — значение более не используется.

* &#39;REPLACING_ORDER&#39; — покупатель решил заменить товар другим по собственной инициативе.

* &#39;RESERVATION_EXPIRED&#39; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.

* &#39;RESERVATION_FAILED&#39; — Маркет не может продолжить дальнейшую обработку заказа.

* &#39;SHOP_FAILED&#39; — магазин не может выполнить заказ.

* &#39;USER_CHANGED_MIND&#39; — покупатель отменил заказ по личным причинам.

* &#39;USER_NOT_PAID&#39; — покупатель не оплатил заказ (для типа оплаты &#39;PREPAID&#39;) в течение 30 минут.

* &#39;USER_REFUSED_DELIVERY&#39; — покупателя не устроили условия доставки.

* &#39;USER_REFUSED_PRODUCT&#39; — покупателю не подошел товар.

* &#39;USER_REFUSED_QUALITY&#39; — покупателя не устроило качество товара.

* &#39;USER_UNREACHABLE&#39; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:

  * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
  * перерыв между первым и третьим звонком не менее 90 минут;
  * соединение не короче 5 секунд.

  Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
* &#39;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#39; — покупатель хочет получить заказ в другой день.
* &#39;CANCELLED_COURIER_NOT_FOUND&#39; — не удалось найти курьера.

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"fromDate=:[QUERY] Начальная дата для фильтрации заказов по дате оформления.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;toDate&#39;) должно быть не больше 30 дней.

Значение по умолчанию: 30 дней назад от текущей даты."
"toDate=:[QUERY] Конечная дата для фильтрации заказов по дате оформления.

Показываются заказы, созданные до 00:00 указанного дня.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;fromDate&#39;) и конечной датой должно быть не больше 30 дней.

Значение по умолчанию: текущая дата."
"supplierShipmentDateFrom=:[QUERY] Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;supplierShipmentDateTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"supplierShipmentDateTo=:[QUERY] Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;supplierShipmentDateFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"updatedAtFrom=:[QUERY] Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной и конечной датой (параметр &#39;updatedAtTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"updatedAtTo=:[QUERY] Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной (параметр &#39;updatedAtFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"dispatchType=:[QUERY] Способ отгрузки"
"fake=true:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
          "fake=false:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
"hasCis=true:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
          "hasCis=false:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
"onlyWaitingForCancellationApprove=true:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
          "onlyWaitingForCancellationApprove=false:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
"onlyEstimatedDelivery=true:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
          "onlyEstimatedDelivery=false:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
"buyerType=:[QUERY] Фильтрация заказов по типу покупателя."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrdersStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"archived=true:[QUERY] Фильтр по нахождению в архиве."
          "archived=false:[QUERY] Фильтр по нахождению в архиве."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPricesByOfferIds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromos)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatingDetails)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReportInfo)
        local -a _op_arguments
        _op_arguments=(
          "reportId=:[PATH] Идентификатор отчета, который вы получили после запуска генерации."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturn)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnApplication)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnPhoto)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
"itemId=:[PATH] Идентификатор товара в возврате."
"imageHash=:[PATH] Хеш ссылки изображения для загрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturns)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"orderIds=:[QUERY] Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50."
"statuses=:[QUERY] Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую."
"type=:[QUERY] Тип заказа для фильтрации:

* &#39;RETURN&#39; — возврат.

* &#39;UNREDEEMED&#39; — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы."
"fromDate=:[QUERY] Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"toDate=:[QUERY] Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"from_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;fromDate&#39;.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления."
"to_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;toDate&#39;.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getWarehouses)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      provideOrderItemIdentifiers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      refreshFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionChildren)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsById)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsByName)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] Название региона.

Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#39;Москва&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendFileToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendMessageToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setFeedParams)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderBoxLayout)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderShipmentBoxes)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      skipGoodsFeedbacksReaction)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferContent)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderItems)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatus)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatuses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      verifyOrderEac)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addOffersToArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      calculateTariffs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmCampaignPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmShipment)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffersFromArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deletePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentDiscrepancyAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentInboundAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentPalletLabels)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
          "format=:[QUERY] Формат страниц PDF-файла с ярлыками:

* &#39;A4&#39; — по 16 ярлыков на странице.
* &#39;A8&#39; — по одному ярлыку на странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentReceptionTransferAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "warehouse_id=:[QUERY] Идентификатор склада."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentTransportationWaybill)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateBoostConsolidatedReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateCompetitorsPositionReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsFeedbackReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsRealizationReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateMassOrderLabelsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabel)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Идентификатор грузоместа."
"boxId=:[PATH] Идентификатор коробки."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabels)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generatePricesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShelfsStatisticsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShipmentListDocumentReport)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShowsSalesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateStocksOnWarehousesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedMarketplaceServicesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedNettingReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedOrdersReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "feedId=:[QUERY] Идентификатор прайс-листа."
"chunk=:[QUERY] Номер сегмента с результатами.

Значение по умолчанию: &#39;0&#39;.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#39;chunk&#x3D;0&#39; и т. д.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsInfoForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessSettings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignLogins)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignRegion)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignSettings)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaigns)
        local -a _op_arguments
        _op_arguments=(
                    "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignsByLogin)
        local -a _op_arguments
        _op_arguments=(
          "login=:[PATH] Логин пользователя."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesMaxSaleQuantum)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesTree)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoryContentParameters)
        local -a _op_arguments
        _op_arguments=(
          "categoryId=:[PATH] Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChatHistory)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChats)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDeliveryServices)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedIndexLogs)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
          "limit=:[QUERY] Количество значений на одной странице."
"published_time_from=:[QUERY] Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Значение по умолчанию: последние восемь дней со времени отправки запроса."
"published_time_to=:[QUERY] Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-31T00:42:42+03:00&#39;.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#39;published_time_to&#39;. Значение параметра не должно быть датой из будущего.

{% endnote %}"
"status=:[QUERY] Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* &#39;ERROR&#39; — произошли ошибки.
* &#39;OK&#39; — обработан без ошибок.
* &#39;WARNING&#39; — наблюдались некритичные проблемы."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedbackAndCommentUpdates)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"from_date=:[QUERY] Начальная дата обновления отзывов.

Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.

Формат даты: &#39;ГГГГ-ММ-ДД&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeeds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbackComments)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbacks)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор скрытого предложения."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"offset=:[QUERY] Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром &#39;limit&#39;.

Если задан &#39;offset&#39;, параметры &#39;page_number&#39; и &#39;page_size&#39; игнорируются.

&#39;offset&#39; игнорируется, если задан &#39;page_token&#39;."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferCardsContentStatus)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор товара в каталоге."
"shop_sku=:[QUERY] Ваш SKU товара.

Параметр может быть указан несколько раз, например:

&#39;&#39;&#39;
...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"mapping_kind=:[QUERY] Тип маппинга."
"status=:[QUERY] Фильтрация по статусу публикации товара:

* &#39;READY&#39; — товар прошел модерацию.
* &#39;IN_WORK&#39; — товар проходит модерацию.
* &#39;NEED_CONTENT&#39; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* &#39;NEED_INFO&#39; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* &#39;REJECTED&#39; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* &#39;SUSPENDED&#39; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* &#39;OTHER&#39; — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...status&#x3D;READY,IN_WORK...
...status&#x3D;READY&amp;status&#x3D;IN_WORK...
&#39;&#39;&#39;

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"availability=:[QUERY] Фильтрация по планам поставок товара:

* &#39;ACTIVE&#39; — поставки будут.
* &#39;INACTIVE&#39; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* &#39;DELISTED&#39; — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...availability&#x3D;INACTIVE,DELISTED...
...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"category_id=:[QUERY] Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...category_id&#x3D;14727164,14382343...
...category_id&#x3D;14727164&amp;category_id&#x3D;14382343...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"vendor=:[QUERY] Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...vendor&#x3D;Aqua%20Minerale,Borjomi...
...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi...
&#39;&#39;&#39;

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "query=:[QUERY] Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете."
"feedId=:[QUERY] Идентификатор прайс-листа."
"shopCategoryId=:[QUERY] Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API."
"currency=:[QUERY] Валюта, в которой указана цена предложения.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна."
"matched=true:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
          "matched=false:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrder)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessDocumentsInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderLabelsData)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrders)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "orderIds=:[QUERY] Фильтрация заказов по идентификаторам.
&lt;br&gt;&lt;br&gt;
⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым."
"status=:[QUERY] Статус заказа:

* &#39;CANCELLED&#39; — заказ отменен.

* &#39;DELIVERED&#39; — заказ получен покупателем.

* &#39;DELIVERY&#39; — заказ передан в службу доставки.

* &#39;PICKUP&#39; — заказ доставлен в пункт самовывоза.

* &#39;PROCESSING&#39; — заказ находится в обработке.

* &#39;UNPAID&#39; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"substatus=:[QUERY] Этап обработки заказа (если он имеет статус &#39;PROCESSING&#39;) или причина отмены заказа (если он имеет статус &#39;CANCELLED&#39;).

Возможные значения для заказа в статусе &#39;PROCESSING&#39;:

* &#39;STARTED&#39; — заказ подтвержден, его можно начать обрабатывать.
* &#39;READY_TO_SHIP&#39; — заказ собран и готов к отправке.
* &#39;SHIPPED&#39; — заказ передан службе доставки.

Возможные значения для заказа в статусе &#39;CANCELLED&#39;:

* &#39;DELIVERY_SERVICE_UNDELIVERED&#39; — служба доставки не смогла доставить заказ.

* &#39;PROCESSING_EXPIRED&#39; — значение более не используется.

* &#39;REPLACING_ORDER&#39; — покупатель решил заменить товар другим по собственной инициативе.

* &#39;RESERVATION_EXPIRED&#39; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.

* &#39;RESERVATION_FAILED&#39; — Маркет не может продолжить дальнейшую обработку заказа.

* &#39;SHOP_FAILED&#39; — магазин не может выполнить заказ.

* &#39;USER_CHANGED_MIND&#39; — покупатель отменил заказ по личным причинам.

* &#39;USER_NOT_PAID&#39; — покупатель не оплатил заказ (для типа оплаты &#39;PREPAID&#39;) в течение 30 минут.

* &#39;USER_REFUSED_DELIVERY&#39; — покупателя не устроили условия доставки.

* &#39;USER_REFUSED_PRODUCT&#39; — покупателю не подошел товар.

* &#39;USER_REFUSED_QUALITY&#39; — покупателя не устроило качество товара.

* &#39;USER_UNREACHABLE&#39; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:

  * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
  * перерыв между первым и третьим звонком не менее 90 минут;
  * соединение не короче 5 секунд.

  Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
* &#39;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#39; — покупатель хочет получить заказ в другой день.
* &#39;CANCELLED_COURIER_NOT_FOUND&#39; — не удалось найти курьера.

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"fromDate=:[QUERY] Начальная дата для фильтрации заказов по дате оформления.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;toDate&#39;) должно быть не больше 30 дней.

Значение по умолчанию: 30 дней назад от текущей даты."
"toDate=:[QUERY] Конечная дата для фильтрации заказов по дате оформления.

Показываются заказы, созданные до 00:00 указанного дня.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;fromDate&#39;) и конечной датой должно быть не больше 30 дней.

Значение по умолчанию: текущая дата."
"supplierShipmentDateFrom=:[QUERY] Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;supplierShipmentDateTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"supplierShipmentDateTo=:[QUERY] Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;supplierShipmentDateFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"updatedAtFrom=:[QUERY] Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной и конечной датой (параметр &#39;updatedAtTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"updatedAtTo=:[QUERY] Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной (параметр &#39;updatedAtFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"dispatchType=:[QUERY] Способ отгрузки"
"fake=true:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
          "fake=false:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
"hasCis=true:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
          "hasCis=false:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
"onlyWaitingForCancellationApprove=true:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
          "onlyWaitingForCancellationApprove=false:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
"onlyEstimatedDelivery=true:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
          "onlyEstimatedDelivery=false:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
"buyerType=:[QUERY] Фильтрация заказов по типу покупателя."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrdersStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"archived=true:[QUERY] Фильтр по нахождению в архиве."
          "archived=false:[QUERY] Фильтр по нахождению в архиве."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPricesByOfferIds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromos)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatingDetails)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReportInfo)
        local -a _op_arguments
        _op_arguments=(
          "reportId=:[PATH] Идентификатор отчета, который вы получили после запуска генерации."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturn)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnApplication)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnPhoto)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
"itemId=:[PATH] Идентификатор товара в возврате."
"imageHash=:[PATH] Хеш ссылки изображения для загрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturns)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"orderIds=:[QUERY] Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50."
"statuses=:[QUERY] Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую."
"type=:[QUERY] Тип заказа для фильтрации:

* &#39;RETURN&#39; — возврат.

* &#39;UNREDEEMED&#39; — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы."
"fromDate=:[QUERY] Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"toDate=:[QUERY] Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"from_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;fromDate&#39;.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления."
"to_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;toDate&#39;.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getShipment)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
          "cancelledOrders=true:[QUERY] Возвращать ли отмененные заказы.

Значение по умолчанию — &#39;true&#39;. Если возвращать отмененные заказы не нужно, передайте значение &#39;false&#39;."
          "cancelledOrders=false:[QUERY] Возвращать ли отмененные заказы.

Значение по умолчанию — &#39;true&#39;. Если возвращать отмененные заказы не нужно, передайте значение &#39;false&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getShipmentOrdersInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getWarehouses)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      provideOrderItemIdentifiers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      refreshFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionChildren)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsById)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsByName)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] Название региона.

Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#39;Москва&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchShipments)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendFileToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendMessageToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setFeedParams)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderBoxLayout)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderShipmentBoxes)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setShipmentPalletsCount)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      skipGoodsFeedbacksReaction)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      transferOrdersFromShipment)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferContent)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderItems)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatus)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatuses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addOffersToArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      calculateTariffs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmCampaignPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOffersFromArchive)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deletePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateBoostConsolidatedReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateCompetitorsPositionReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsFeedbackReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsMovementReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsRealizationReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsTurnoverReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generatePricesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShelfsStatisticsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShowsSalesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateStocksOnWarehousesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedMarketplaceServicesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedNettingReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedOrdersReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "feedId=:[QUERY] Идентификатор прайс-листа."
"chunk=:[QUERY] Номер сегмента с результатами.

Значение по умолчанию: &#39;0&#39;.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#39;chunk&#x3D;0&#39; и т. д.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsInfoForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBidsRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessSettings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignLogins)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignRegion)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignSettings)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaigns)
        local -a _op_arguments
        _op_arguments=(
                    "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignsByLogin)
        local -a _op_arguments
        _op_arguments=(
          "login=:[PATH] Логин пользователя."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesMaxSaleQuantum)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoriesTree)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCategoryContentParameters)
        local -a _op_arguments
        _op_arguments=(
          "categoryId=:[PATH] Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChatHistory)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getChats)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedIndexLogs)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
          "limit=:[QUERY] Количество значений на одной странице."
"published_time_from=:[QUERY] Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Значение по умолчанию: последние восемь дней со времени отправки запроса."
"published_time_to=:[QUERY] Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-31T00:42:42+03:00&#39;.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#39;published_time_to&#39;. Значение параметра не должно быть датой из будущего.

{% endnote %}"
"status=:[QUERY] Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* &#39;ERROR&#39; — произошли ошибки.
* &#39;OK&#39; — обработан без ошибок.
* &#39;WARNING&#39; — наблюдались некритичные проблемы."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedbackAndCommentUpdates)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"from_date=:[QUERY] Начальная дата обновления отзывов.

Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.

Формат даты: &#39;ГГГГ-ММ-ДД&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeeds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFulfillmentWarehouses)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbackComments)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbacks)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор скрытого предложения."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"offset=:[QUERY] Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром &#39;limit&#39;.

Если задан &#39;offset&#39;, параметры &#39;page_number&#39; и &#39;page_size&#39; игнорируются.

&#39;offset&#39; игнорируется, если задан &#39;page_token&#39;."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferCardsContentStatus)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор товара в каталоге."
"shop_sku=:[QUERY] Ваш SKU товара.

Параметр может быть указан несколько раз, например:

&#39;&#39;&#39;
...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"mapping_kind=:[QUERY] Тип маппинга."
"status=:[QUERY] Фильтрация по статусу публикации товара:

* &#39;READY&#39; — товар прошел модерацию.
* &#39;IN_WORK&#39; — товар проходит модерацию.
* &#39;NEED_CONTENT&#39; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* &#39;NEED_INFO&#39; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* &#39;REJECTED&#39; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* &#39;SUSPENDED&#39; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* &#39;OTHER&#39; — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...status&#x3D;READY,IN_WORK...
...status&#x3D;READY&amp;status&#x3D;IN_WORK...
&#39;&#39;&#39;

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"availability=:[QUERY] Фильтрация по планам поставок товара:

* &#39;ACTIVE&#39; — поставки будут.
* &#39;INACTIVE&#39; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* &#39;DELISTED&#39; — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...availability&#x3D;INACTIVE,DELISTED...
...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"category_id=:[QUERY] Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...category_id&#x3D;14727164,14382343...
...category_id&#x3D;14727164&amp;category_id&#x3D;14382343...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"vendor=:[QUERY] Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...vendor&#x3D;Aqua%20Minerale,Borjomi...
...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi...
&#39;&#39;&#39;

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "query=:[QUERY] Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете."
"feedId=:[QUERY] Идентификатор прайс-листа."
"shopCategoryId=:[QUERY] Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API."
"currency=:[QUERY] Валюта, в которой указана цена предложения.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна."
"matched=true:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
          "matched=false:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrder)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessDocumentsInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrders)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "orderIds=:[QUERY] Фильтрация заказов по идентификаторам.
&lt;br&gt;&lt;br&gt;
⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым."
"status=:[QUERY] Статус заказа:

* &#39;CANCELLED&#39; — заказ отменен.

* &#39;DELIVERED&#39; — заказ получен покупателем.

* &#39;DELIVERY&#39; — заказ передан в службу доставки.

* &#39;PICKUP&#39; — заказ доставлен в пункт самовывоза.

* &#39;PROCESSING&#39; — заказ находится в обработке.

* &#39;UNPAID&#39; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"substatus=:[QUERY] Этап обработки заказа (если он имеет статус &#39;PROCESSING&#39;) или причина отмены заказа (если он имеет статус &#39;CANCELLED&#39;).

Возможные значения для заказа в статусе &#39;PROCESSING&#39;:

* &#39;STARTED&#39; — заказ подтвержден, его можно начать обрабатывать.
* &#39;READY_TO_SHIP&#39; — заказ собран и готов к отправке.
* &#39;SHIPPED&#39; — заказ передан службе доставки.

Возможные значения для заказа в статусе &#39;CANCELLED&#39;:

* &#39;DELIVERY_SERVICE_UNDELIVERED&#39; — служба доставки не смогла доставить заказ.

* &#39;PROCESSING_EXPIRED&#39; — значение более не используется.

* &#39;REPLACING_ORDER&#39; — покупатель решил заменить товар другим по собственной инициативе.

* &#39;RESERVATION_EXPIRED&#39; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.

* &#39;RESERVATION_FAILED&#39; — Маркет не может продолжить дальнейшую обработку заказа.

* &#39;SHOP_FAILED&#39; — магазин не может выполнить заказ.

* &#39;USER_CHANGED_MIND&#39; — покупатель отменил заказ по личным причинам.

* &#39;USER_NOT_PAID&#39; — покупатель не оплатил заказ (для типа оплаты &#39;PREPAID&#39;) в течение 30 минут.

* &#39;USER_REFUSED_DELIVERY&#39; — покупателя не устроили условия доставки.

* &#39;USER_REFUSED_PRODUCT&#39; — покупателю не подошел товар.

* &#39;USER_REFUSED_QUALITY&#39; — покупателя не устроило качество товара.

* &#39;USER_UNREACHABLE&#39; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:

  * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
  * перерыв между первым и третьим звонком не менее 90 минут;
  * соединение не короче 5 секунд.

  Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
* &#39;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#39; — покупатель хочет получить заказ в другой день.
* &#39;CANCELLED_COURIER_NOT_FOUND&#39; — не удалось найти курьера.

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"fromDate=:[QUERY] Начальная дата для фильтрации заказов по дате оформления.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;toDate&#39;) должно быть не больше 30 дней.

Значение по умолчанию: 30 дней назад от текущей даты."
"toDate=:[QUERY] Конечная дата для фильтрации заказов по дате оформления.

Показываются заказы, созданные до 00:00 указанного дня.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;fromDate&#39;) и конечной датой должно быть не больше 30 дней.

Значение по умолчанию: текущая дата."
"supplierShipmentDateFrom=:[QUERY] Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;supplierShipmentDateTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"supplierShipmentDateTo=:[QUERY] Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;supplierShipmentDateFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"updatedAtFrom=:[QUERY] Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной и конечной датой (параметр &#39;updatedAtTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"updatedAtTo=:[QUERY] Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной (параметр &#39;updatedAtFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"dispatchType=:[QUERY] Способ отгрузки"
"fake=true:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
          "fake=false:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
"hasCis=true:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
          "hasCis=false:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
"onlyWaitingForCancellationApprove=true:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
          "onlyWaitingForCancellationApprove=false:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
"onlyEstimatedDelivery=true:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
          "onlyEstimatedDelivery=false:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
"buyerType=:[QUERY] Фильтрация заказов по типу покупателя."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrdersStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"archived=true:[QUERY] Фильтр по нахождению в архиве."
          "archived=false:[QUERY] Фильтр по нахождению в архиве."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPricesByOfferIds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromos)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReportInfo)
        local -a _op_arguments
        _op_arguments=(
          "reportId=:[PATH] Идентификатор отчета, который вы получили после запуска генерации."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturn)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnPhoto)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
"itemId=:[PATH] Идентификатор товара в возврате."
"imageHash=:[PATH] Хеш ссылки изображения для загрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturns)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"orderIds=:[QUERY] Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50."
"statuses=:[QUERY] Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую."
"type=:[QUERY] Тип заказа для фильтрации:

* &#39;RETURN&#39; — возврат.

* &#39;UNREDEEMED&#39; — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы."
"fromDate=:[QUERY] Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"toDate=:[QUERY] Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"from_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;fromDate&#39;.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления."
"to_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;toDate&#39;.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForBusiness)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      putBidsForCampaign)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      refreshFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionChildren)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsById)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsByName)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] Название региона.

Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#39;Москва&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendFileToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sendMessageToChat)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "chatId=:[QUERY] Идентификатор чата."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setFeedParams)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      skipGoodsFeedbacksReaction)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferContent)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedbackAndCommentUpdates)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"from_date=:[QUERY] Начальная дата обновления отзывов.

Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.

Формат даты: &#39;ГГГГ-ММ-ДД&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeedIndexLogs)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
          "limit=:[QUERY] Количество значений на одной странице."
"published_time_from=:[QUERY] Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Значение по умолчанию: последние восемь дней со времени отправки запроса."
"published_time_to=:[QUERY] Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-31T00:42:42+03:00&#39;.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#39;published_time_to&#39;. Значение параметра не должно быть датой из будущего.

{% endnote %}"
"status=:[QUERY] Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* &#39;ERROR&#39; — произошли ошибки.
* &#39;OK&#39; — обработан без ошибок.
* &#39;WARNING&#39; — наблюдались некритичные проблемы."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFeeds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      refreshFeed)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setFeedParams)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"feedId=:[PATH] Идентификатор прайс-листа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbackComments)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsFeedbacks)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      skipGoodsFeedbacksReaction)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateGoodsFeedbackComment)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getGoodsStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getHiddenOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор скрытого предложения."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"offset=:[QUERY] Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром &#39;limit&#39;.

Если задан &#39;offset&#39;, параметры &#39;page_number&#39; и &#39;page_size&#39; игнорируются.

&#39;offset&#39; игнорируется, если задан &#39;page_token&#39;."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModel)
        local -a _op_arguments
        _op_arguments=(
          "modelId=:[PATH] Идентификатор модели товара."
          "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModelOffers)
        local -a _op_arguments
        _op_arguments=(
          "modelId=:[PATH] Идентификатор модели товара."
          "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
"orderByPrice=:[QUERY] Направление сортировки по цене.

Возможные значения:
* &#39;ASC&#39; — сортировка по возрастанию.
* &#39;DESC&#39; — сортировка по убыванию.

Значение по умолчанию: предложения выводятся в произвольном порядке."
"count=:[QUERY] Количество предложений на странице ответа."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModels)
        local -a _op_arguments
        _op_arguments=(
                    "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getModelsOffers)
        local -a _op_arguments
        _op_arguments=(
                    "regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
"orderByPrice=:[QUERY] Направление сортировки по цене.

Возможные значения:
* &#39;ASC&#39; — сортировка по возрастанию.
* &#39;DESC&#39; — сортировка по убыванию.

Значение по умолчанию: предложения выводятся в произвольном порядке."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchModels)
        local -a _op_arguments
        _op_arguments=(
                    "query=:[QUERY] Поисковый запрос по названию модели товара."
"regionId=:[QUERY] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
"currency=:[QUERY] Валюта, в которой отображаются цены предложений на страницах с результатами поиска.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна.

Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "offer_id=:[QUERY] Идентификатор товара в каталоге."
"shop_sku=:[QUERY] Ваш SKU товара.

Параметр может быть указан несколько раз, например:

&#39;&#39;&#39;
...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"mapping_kind=:[QUERY] Тип маппинга."
"status=:[QUERY] Фильтрация по статусу публикации товара:

* &#39;READY&#39; — товар прошел модерацию.
* &#39;IN_WORK&#39; — товар проходит модерацию.
* &#39;NEED_CONTENT&#39; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* &#39;NEED_INFO&#39; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* &#39;REJECTED&#39; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* &#39;SUSPENDED&#39; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* &#39;OTHER&#39; — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...status&#x3D;READY,IN_WORK...
...status&#x3D;READY&amp;status&#x3D;IN_WORK...
&#39;&#39;&#39;

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"availability=:[QUERY] Фильтрация по планам поставок товара:

* &#39;ACTIVE&#39; — поставки будут.
* &#39;INACTIVE&#39; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* &#39;DELISTED&#39; — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...availability&#x3D;INACTIVE,DELISTED...
...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"category_id=:[QUERY] Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...category_id&#x3D;14727164,14382343...
...category_id&#x3D;14727164&amp;category_id&#x3D;14382343...
&#39;&#39;&#39;

В запросе можно указать либо параметр &#39;shopSku&#39;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#39;shopSku&#39; и параметров для фильтрации приведет к ошибке."
"vendor=:[QUERY] Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

&#39;&#39;&#39;
...vendor&#x3D;Aqua%20Minerale,Borjomi...
...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi...
&#39;&#39;&#39;

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOfferMappingEntries)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "feedId=:[QUERY] Идентификатор прайс-листа."
"chunk=:[QUERY] Номер сегмента с результатами.

Значение по умолчанию: &#39;0&#39;.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#39;chunk&#x3D;0&#39; и т. д.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOfferRecommendations)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "query=:[QUERY] Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете."
"feedId=:[QUERY] Идентификатор прайс-листа."
"shopCategoryId=:[QUERY] Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API."
"currency=:[QUERY] Валюта, в которой указана цена предложения.

Возможные значения:

* &#39;BYN&#39; — белорусский рубль.

* &#39;KZT&#39; — казахстанский тенге.

* &#39;RUR&#39; — российский рубль.

* &#39;UAH&#39; — украинская гривна."
"matched=true:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
          "matched=false:[QUERY] Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* &#39;0 / FALSE / NO&#39; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* &#39;1 / TRUE / YES&#39; — поиск выполняется среди предложений, соотнесенных с карточками моделей)."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateCampaignOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBusinessDocumentsInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderBuyerInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderDeliveryDate)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderDeliveryTrackCode)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStorageLimit)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      verifyOrderEac)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabel)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Идентификатор грузоместа."
"boxId=:[PATH] Идентификатор коробки."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOrderLabels)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
          "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrderLabelsData)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      acceptOrderCancellation)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrder)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrders)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "orderIds=:[QUERY] Фильтрация заказов по идентификаторам.
&lt;br&gt;&lt;br&gt;
⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым."
"status=:[QUERY] Статус заказа:

* &#39;CANCELLED&#39; — заказ отменен.

* &#39;DELIVERED&#39; — заказ получен покупателем.

* &#39;DELIVERY&#39; — заказ передан в службу доставки.

* &#39;PICKUP&#39; — заказ доставлен в пункт самовывоза.

* &#39;PROCESSING&#39; — заказ находится в обработке.

* &#39;UNPAID&#39; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"substatus=:[QUERY] Этап обработки заказа (если он имеет статус &#39;PROCESSING&#39;) или причина отмены заказа (если он имеет статус &#39;CANCELLED&#39;).

Возможные значения для заказа в статусе &#39;PROCESSING&#39;:

* &#39;STARTED&#39; — заказ подтвержден, его можно начать обрабатывать.
* &#39;READY_TO_SHIP&#39; — заказ собран и готов к отправке.
* &#39;SHIPPED&#39; — заказ передан службе доставки.

Возможные значения для заказа в статусе &#39;CANCELLED&#39;:

* &#39;DELIVERY_SERVICE_UNDELIVERED&#39; — служба доставки не смогла доставить заказ.

* &#39;PROCESSING_EXPIRED&#39; — значение более не используется.

* &#39;REPLACING_ORDER&#39; — покупатель решил заменить товар другим по собственной инициативе.

* &#39;RESERVATION_EXPIRED&#39; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.

* &#39;RESERVATION_FAILED&#39; — Маркет не может продолжить дальнейшую обработку заказа.

* &#39;SHOP_FAILED&#39; — магазин не может выполнить заказ.

* &#39;USER_CHANGED_MIND&#39; — покупатель отменил заказ по личным причинам.

* &#39;USER_NOT_PAID&#39; — покупатель не оплатил заказ (для типа оплаты &#39;PREPAID&#39;) в течение 30 минут.

* &#39;USER_REFUSED_DELIVERY&#39; — покупателя не устроили условия доставки.

* &#39;USER_REFUSED_PRODUCT&#39; — покупателю не подошел товар.

* &#39;USER_REFUSED_QUALITY&#39; — покупателя не устроило качество товара.

* &#39;USER_UNREACHABLE&#39; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:

  * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
  * перерыв между первым и третьим звонком не менее 90 минут;
  * соединение не короче 5 секунд.

  Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
* &#39;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#39; — покупатель хочет получить заказ в другой день.
* &#39;CANCELLED_COURIER_NOT_FOUND&#39; — не удалось найти курьера.

Также могут возвращаться другие значения. Обрабатывать их не требуется."
"fromDate=:[QUERY] Начальная дата для фильтрации заказов по дате оформления.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;toDate&#39;) должно быть не больше 30 дней.

Значение по умолчанию: 30 дней назад от текущей даты."
"toDate=:[QUERY] Конечная дата для фильтрации заказов по дате оформления.

Показываются заказы, созданные до 00:00 указанного дня.

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;fromDate&#39;) и конечной датой должно быть не больше 30 дней.

Значение по умолчанию: текущая дата."
"supplierShipmentDateFrom=:[QUERY] Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной и конечной датой (параметр &#39;supplierShipmentDateTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"supplierShipmentDateTo=:[QUERY] Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#39;shipmentDate&#39;).

Формат даты: &#39;ДД-ММ-ГГГГ&#39;.

Между начальной (параметр &#39;supplierShipmentDateFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"updatedAtFrom=:[QUERY] Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной и конечной датой (параметр &#39;updatedAtTo&#39;) должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации."
"updatedAtTo=:[QUERY] Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#39;updatedAt&#39;).

Формат даты: ISO 8601 со смещением относительно UTC. Например, &#39;2017-11-21T00:42:42+03:00&#39;.

Между начальной (параметр &#39;updatedAtFrom&#39;) и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации."
"dispatchType=:[QUERY] Способ отгрузки"
"fake=true:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
          "fake=false:[QUERY] Фильтрация заказов по типам:

* &#39;false&#39; — настоящий заказ покупателя.

* &#39;true&#39; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета."
"hasCis=true:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
          "hasCis=false:[QUERY] Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* &#39;true&#39; — да.

* &#39;false&#39; — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям."
"onlyWaitingForCancellationApprove=true:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
          "onlyWaitingForCancellationApprove=false:[QUERY] **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение &#39;true&#39; возвращаются только заказы, которые находятся в статусе &#39;DELIVERY&#39; или &#39;PICKUP&#39; и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation)."
"onlyEstimatedDelivery=true:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
          "onlyEstimatedDelivery=false:[QUERY] Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* &#39;true&#39; — возвращаются только заказы с неподтвержденной датой доставки.
* &#39;false&#39; — фильтрация не применяется."
"buyerType=:[QUERY] Фильтрация заказов по типу покупателя."
"page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      provideOrderDigitalCodes)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      provideOrderItemIdentifiers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderBoxLayout)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setOrderShipmentBoxes)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"shipmentId=:[PATH] Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderItems)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatus)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrderStatuses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrdersStats)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOutletLicenses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "ids=:[QUERY] Список идентификаторов лицензий."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOutletLicenses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "outletIds=:[QUERY] Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.

В запросе должен быть либо параметр &#39;outletIds&#39;, либо параметр &#39;ids&#39;. Запрос с обоими параметрами или без них приведет к ошибке."
"ids=:[QUERY] Список идентификаторов лицензий."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOutletLicenses)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"outletId=:[PATH] Идентификатор точки продаж."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"outletId=:[PATH] Идентификатор точки продаж."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOutlets)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"region_id=:[QUERY] Идентификатор региона.
Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов.
Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md)."
"shop_outlet_code=:[QUERY] Идентификатор точки продаж, присвоенный магазином."
"regionId=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Для указания региона используйте &#39;region_id&#39;.

{% endnote %}"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOutlet)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"outletId=:[PATH] Идентификатор точки продаж."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmCampaignPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCampaignQuarantineOffers)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"archived=true:[QUERY] Фильтр по нахождению в архиве."
          "archived=false:[QUERY] Фильтр по нахождению в архиве."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPricesByOfferIds)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSuggestedPrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessPrices)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePrices)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deletePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPromos)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePromoOffers)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatingDetails)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getQualityRatings)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionChildren)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
          "page=:[QUERY] Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром &#39;page_size&#39;.

&#39;page_number&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
"pageSize=:[QUERY] Размер страницы.

Используется вместе с параметром &#39;page_number&#39;.

&#39;page_size&#39; игнорируется, если задан &#39;page_token&#39;, &#39;limit&#39; или &#39;offset&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsById)
        local -a _op_arguments
        _op_arguments=(
          "regionId=:[PATH] Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchRegionsByName)
        local -a _op_arguments
        _op_arguments=(
                    "name=:[QUERY] Название региона.

Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#39;Москва&#39;."
"page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateBoostConsolidatedReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateCompetitorsPositionReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsFeedbackReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsMovementReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsRealizationReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateGoodsTurnoverReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateMassOrderLabelsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generatePricesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShelfsStatisticsReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShipmentListDocumentReport)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateShowsSalesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateStocksOnWarehousesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedMarketplaceServicesReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedNettingReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateUnitedOrdersReport)
        local -a _op_arguments
        _op_arguments=(
                    "format=:[QUERY] Формат отчета."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReportInfo)
        local -a _op_arguments
        _op_arguments=(
          "reportId=:[PATH] Идентификатор отчета, который вы получили после запуска генерации."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturn)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnApplication)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturnPhoto)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
"itemId=:[PATH] Идентификатор товара в возврате."
"imageHash=:[PATH] Хеш ссылки изображения для загрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getReturns)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
"orderIds=:[QUERY] Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50."
"statuses=:[QUERY] Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую."
"type=:[QUERY] Тип заказа для фильтрации:

* &#39;RETURN&#39; — возврат.

* &#39;UNREDEEMED&#39; — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы."
"fromDate=:[QUERY] Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"toDate=:[QUERY] Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: &#39;ГГГГ-ММ-ДД&#39;."
"from_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;fromDate&#39;.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления."
"to_date=:[QUERY] {% note warning \&quot;\&quot; %}

Этот параметр устарел. Вместо него используйте &#39;toDate&#39;.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setReturnDecision)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitReturnDecision)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"orderId=:[PATH] Идентификатор заказа."
"returnId=:[PATH] Идентификатор возврата."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      confirmShipment)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentDiscrepancyAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentInboundAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentPalletLabels)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
          "format=:[QUERY] Формат страниц PDF-файла с ярлыками:

* &#39;A4&#39; — по 16 ярлыков на странице.
* &#39;A8&#39; — по одному ярлыку на странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentReceptionTransferAct)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "warehouse_id=:[QUERY] Идентификатор склада."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadShipmentTransportationWaybill)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getShipment)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
          "cancelledOrders=true:[QUERY] Возвращать ли отмененные заказы.

Значение по умолчанию — &#39;true&#39;. Если возвращать отмененные заказы не нужно, передайте значение &#39;false&#39;."
          "cancelledOrders=false:[QUERY] Возвращать ли отмененные заказы.

Значение по умолчанию — &#39;true&#39;. Если возвращать отмененные заказы не нужно, передайте значение &#39;false&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getShipmentOrdersInfo)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchShipments)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setShipmentPalletsCount)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      transferOrdersFromShipment)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
"shipmentId=:[PATH] Идентификатор отгрузки."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
          "page_token=:[QUERY] Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра &#39;nextPageToken&#39;, полученное при последнем запросе.

Если задан &#39;page_token&#39; и в запросе есть параметры &#39;offset&#39;, &#39;page_number&#39; и &#39;page_size&#39;, они игнорируются."
"limit=:[QUERY] Количество значений на одной странице."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateStocks)
        local -a _op_arguments
        _op_arguments=(
          "campaignId=:[PATH] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      calculateTariffs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFulfillmentWarehouses)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getWarehouses)
        local -a _op_arguments
        _op_arguments=(
          "businessId=:[PATH] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
