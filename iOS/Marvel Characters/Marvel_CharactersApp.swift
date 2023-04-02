//
//  Marvel_CharactersApp.swift
//  Marvel Characters
//
//  Created by Alessandro Giaquinto on 02/04/23.
//

import SwiftUI

@main
struct Marvel_CharactersApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
