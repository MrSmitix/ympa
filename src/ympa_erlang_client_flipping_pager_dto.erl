-module(ympa_erlang_client_flipping_pager_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_flipping_pager_dto/0]).

-type ympa_erlang_client_flipping_pager_dto() ::
    #{ 'total' => integer(),
       'from' => integer(),
       'to' => integer(),
       'currentPage' => integer(),
       'pagesCount' => integer(),
       'pageSize' => integer()
     }.

encode(#{ 'total' := Total,
          'from' := From,
          'to' := To,
          'currentPage' := CurrentPage,
          'pagesCount' := PagesCount,
          'pageSize' := PageSize
        }) ->
    #{ 'total' => Total,
       'from' => From,
       'to' => To,
       'currentPage' => CurrentPage,
       'pagesCount' => PagesCount,
       'pageSize' => PageSize
     }.
