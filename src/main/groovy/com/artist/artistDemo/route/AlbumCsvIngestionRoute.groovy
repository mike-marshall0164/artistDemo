// package com.artist.artistDemo.route


// class AlbumCsvIngestionRoute extends RouteBuilder {

//     @Autowired
//     AlbumRepository albumRepository

//     @Override
//     public void configure() {
        
//         from("file:/.?include=albums.csv")
//         .unmarshal()
//         .bindy(BindyType.Csv, FileData.class)
//         .process(new Processor() {
//                 @Override
//                 public void process(Exchange exchange) throws Exception {
//                 }
//         })
//         .end()

//     }
// }