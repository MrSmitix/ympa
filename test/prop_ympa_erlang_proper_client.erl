-module(prop_ympa_erlang_proper_client).

-export([prop_test/0]).

prop_test() ->
  {ok, _} = application:ensure_all_started(ympa_erlang_proper_client),
  ympa_erlang_proper_client_statem:prop_main().
