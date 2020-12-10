(() => {
    var n, r, t = {
        66: (n, r) => {
            r.func1 = function (n) {
                document.write(n)
            }
        }, 354: (n, r) => {
            r.func2 = function (n, r) {
                return n + r
            }
        }
    }, u = {};

    function e(n) {
        if (u[n]) return u[n].exports;
        var r = u[n] = {exports: {}};
        return t[n](r, r.exports, e), r.exports
    }

    n = e(66), r = e(354), n.func1("100+200=" + r.func2(100, 200))
})();