package io.pivotal.trilogy.live.oracle.bootstrap

import io.pivotal.trilogy.DatabaseHelper
import org.jetbrains.spek.api.Spek

class BootstrapTests : Spek({
    DatabaseHelper.executeScript("degenerate")
    it("loads") {}
})